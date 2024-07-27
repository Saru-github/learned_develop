{
 "cells": [
  {
   "cell_type": "markdown",
   "id": "725c5abc",
   "metadata": {
    "pycharm": {
     "name": "#%% md\n"
    }
   },
   "source": [
    "* datetime : hourly date + timestamp\n",
    "\n",
    "* season : 1 = 봄, 2 = 여름, 3 = 가을, 4 = 겨울\n",
    "\n",
    "* holiday : 1 = 토,일요일의 주말을 제외한 국경일과 같은 휴일, 0 = 휴일이 아닌 날\n",
    "\n",
    "* workingday: 1 = 토,일요일의 주말과 휴일을 제외, 0 = 주말 및 휴일\n",
    "\n",
    "* weather:\n",
    "\n",
    "\n",
    "    + 1 = 맑음, 약간 구름 낀 흐림    \n",
    "    + 2 = 안개, 안개 + 흐림    \n",
    "    + 3 = 가벼운 눈, 가벼운 비 + 천둥    \n",
    "    + 4 = 심한 눈, 심한 비+ 천둥\n",
    "    \n",
    "   \n",
    "* temp = 온도(섭씨)\n",
    "\n",
    "* atemp = 체감온도(섭씨)\n",
    "\n",
    "* humidity = 습도\n",
    "\n",
    "* windspeed = 풍속  \n",
    "\n",
    "* casual = 사전 미등록자가 대여한 횟수\n",
    "\n",
    "* registered = 사전 등록자가 대여한 횟수\n",
    "\n",
    "* count = 대여횟수"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 16,
   "id": "b0ddf765",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "## 기본라이브러리\n",
    "\n",
    "import pandas as pd\n",
    "import numpy as np\n",
    "import matplotlib.pyplot as plt\n",
    "import seaborn as sns"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 17,
   "id": "8305a938",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "# 회귀평가지표 - \n",
    "from sklearn.metrics import mean_absolute_error, mean_squared_error, mean_squared_log_error"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 18,
   "id": "ff137bb0",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "# 알고리즘 - 회귀계열\n",
    "from sklearn.linear_model import LinearRegression, Ridge, Lasso"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 24,
   "id": "475eb9c4",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "# 알고리즘-tree 계열 \n",
    "\n",
    "from sklearn.tree import DecisionTreeRegressor\n",
    "from sklearn.ensemble import RandomForestRegressor\n",
    "from sklearn.ensemble import GradientBoostingRegressor\n",
    "from lightgbm import LGBMRegressor"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 25,
   "id": "1b129cb2",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [
    {
     "data": {
      "text/plain": "                  datetime  season  holiday  workingday  weather   temp  \\\n0      2011-01-01 00:00:00       1        0           0        1   9.84   \n1      2011-01-01 01:00:00       1        0           0        1   9.02   \n2      2011-01-01 02:00:00       1        0           0        1   9.02   \n3      2011-01-01 03:00:00       1        0           0        1   9.84   \n4      2011-01-01 04:00:00       1        0           0        1   9.84   \n...                    ...     ...      ...         ...      ...    ...   \n10881  2012-12-19 19:00:00       4        0           1        1  15.58   \n10882  2012-12-19 20:00:00       4        0           1        1  14.76   \n10883  2012-12-19 21:00:00       4        0           1        1  13.94   \n10884  2012-12-19 22:00:00       4        0           1        1  13.94   \n10885  2012-12-19 23:00:00       4        0           1        1  13.12   \n\n        atemp  humidity  windspeed  casual  registered  count  \n0      14.395        81     0.0000       3          13     16  \n1      13.635        80     0.0000       8          32     40  \n2      13.635        80     0.0000       5          27     32  \n3      14.395        75     0.0000       3          10     13  \n4      14.395        75     0.0000       0           1      1  \n...       ...       ...        ...     ...         ...    ...  \n10881  19.695        50    26.0027       7         329    336  \n10882  17.425        57    15.0013      10         231    241  \n10883  15.910        61    15.0013       4         164    168  \n10884  17.425        61     6.0032      12         117    129  \n10885  16.665        66     8.9981       4          84     88  \n\n[10886 rows x 12 columns]",
      "text/html": "<div>\n<style scoped>\n    .dataframe tbody tr th:only-of-type {\n        vertical-align: middle;\n    }\n\n    .dataframe tbody tr th {\n        vertical-align: top;\n    }\n\n    .dataframe thead th {\n        text-align: right;\n    }\n</style>\n<table border=\"1\" class=\"dataframe\">\n  <thead>\n    <tr style=\"text-align: right;\">\n      <th></th>\n      <th>datetime</th>\n      <th>season</th>\n      <th>holiday</th>\n      <th>workingday</th>\n      <th>weather</th>\n      <th>temp</th>\n      <th>atemp</th>\n      <th>humidity</th>\n      <th>windspeed</th>\n      <th>casual</th>\n      <th>registered</th>\n      <th>count</th>\n    </tr>\n  </thead>\n  <tbody>\n    <tr>\n      <th>0</th>\n      <td>2011-01-01 00:00:00</td>\n      <td>1</td>\n      <td>0</td>\n      <td>0</td>\n      <td>1</td>\n      <td>9.84</td>\n      <td>14.395</td>\n      <td>81</td>\n      <td>0.0000</td>\n      <td>3</td>\n      <td>13</td>\n      <td>16</td>\n    </tr>\n    <tr>\n      <th>1</th>\n      <td>2011-01-01 01:00:00</td>\n      <td>1</td>\n      <td>0</td>\n      <td>0</td>\n      <td>1</td>\n      <td>9.02</td>\n      <td>13.635</td>\n      <td>80</td>\n      <td>0.0000</td>\n      <td>8</td>\n      <td>32</td>\n      <td>40</td>\n    </tr>\n    <tr>\n      <th>2</th>\n      <td>2011-01-01 02:00:00</td>\n      <td>1</td>\n      <td>0</td>\n      <td>0</td>\n      <td>1</td>\n      <td>9.02</td>\n      <td>13.635</td>\n      <td>80</td>\n      <td>0.0000</td>\n      <td>5</td>\n      <td>27</td>\n      <td>32</td>\n    </tr>\n    <tr>\n      <th>3</th>\n      <td>2011-01-01 03:00:00</td>\n      <td>1</td>\n      <td>0</td>\n      <td>0</td>\n      <td>1</td>\n      <td>9.84</td>\n      <td>14.395</td>\n      <td>75</td>\n      <td>0.0000</td>\n      <td>3</td>\n      <td>10</td>\n      <td>13</td>\n    </tr>\n    <tr>\n      <th>4</th>\n      <td>2011-01-01 04:00:00</td>\n      <td>1</td>\n      <td>0</td>\n      <td>0</td>\n      <td>1</td>\n      <td>9.84</td>\n      <td>14.395</td>\n      <td>75</td>\n      <td>0.0000</td>\n      <td>0</td>\n      <td>1</td>\n      <td>1</td>\n    </tr>\n    <tr>\n      <th>...</th>\n      <td>...</td>\n      <td>...</td>\n      <td>...</td>\n      <td>...</td>\n      <td>...</td>\n      <td>...</td>\n      <td>...</td>\n      <td>...</td>\n      <td>...</td>\n      <td>...</td>\n      <td>...</td>\n      <td>...</td>\n    </tr>\n    <tr>\n      <th>10881</th>\n      <td>2012-12-19 19:00:00</td>\n      <td>4</td>\n      <td>0</td>\n      <td>1</td>\n      <td>1</td>\n      <td>15.58</td>\n      <td>19.695</td>\n      <td>50</td>\n      <td>26.0027</td>\n      <td>7</td>\n      <td>329</td>\n      <td>336</td>\n    </tr>\n    <tr>\n      <th>10882</th>\n      <td>2012-12-19 20:00:00</td>\n      <td>4</td>\n      <td>0</td>\n      <td>1</td>\n      <td>1</td>\n      <td>14.76</td>\n      <td>17.425</td>\n      <td>57</td>\n      <td>15.0013</td>\n      <td>10</td>\n      <td>231</td>\n      <td>241</td>\n    </tr>\n    <tr>\n      <th>10883</th>\n      <td>2012-12-19 21:00:00</td>\n      <td>4</td>\n      <td>0</td>\n      <td>1</td>\n      <td>1</td>\n      <td>13.94</td>\n      <td>15.910</td>\n      <td>61</td>\n      <td>15.0013</td>\n      <td>4</td>\n      <td>164</td>\n      <td>168</td>\n    </tr>\n    <tr>\n      <th>10884</th>\n      <td>2012-12-19 22:00:00</td>\n      <td>4</td>\n      <td>0</td>\n      <td>1</td>\n      <td>1</td>\n      <td>13.94</td>\n      <td>17.425</td>\n      <td>61</td>\n      <td>6.0032</td>\n      <td>12</td>\n      <td>117</td>\n      <td>129</td>\n    </tr>\n    <tr>\n      <th>10885</th>\n      <td>2012-12-19 23:00:00</td>\n      <td>4</td>\n      <td>0</td>\n      <td>1</td>\n      <td>1</td>\n      <td>13.12</td>\n      <td>16.665</td>\n      <td>66</td>\n      <td>8.9981</td>\n      <td>4</td>\n      <td>84</td>\n      <td>88</td>\n    </tr>\n  </tbody>\n</table>\n<p>10886 rows × 12 columns</p>\n</div>"
     },
     "execution_count": 25,
     "metadata": {},
     "output_type": "execute_result"
    }
   ],
   "source": [
    "bike_df = pd.read_csv('./bike-sharing-demand/train.csv')\n",
    "bike_df"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 26,
   "id": "37b4826a",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "<class 'pandas.core.frame.DataFrame'>\n",
      "RangeIndex: 10886 entries, 0 to 10885\n",
      "Data columns (total 12 columns):\n",
      " #   Column      Non-Null Count  Dtype  \n",
      "---  ------      --------------  -----  \n",
      " 0   datetime    10886 non-null  object \n",
      " 1   season      10886 non-null  int64  \n",
      " 2   holiday     10886 non-null  int64  \n",
      " 3   workingday  10886 non-null  int64  \n",
      " 4   weather     10886 non-null  int64  \n",
      " 5   temp        10886 non-null  float64\n",
      " 6   atemp       10886 non-null  float64\n",
      " 7   humidity    10886 non-null  int64  \n",
      " 8   windspeed   10886 non-null  float64\n",
      " 9   casual      10886 non-null  int64  \n",
      " 10  registered  10886 non-null  int64  \n",
      " 11  count       10886 non-null  int64  \n",
      "dtypes: float64(3), int64(8), object(1)\n",
      "memory usage: 1020.7+ KB\n"
     ]
    }
   ],
   "source": [
    "bike_df.info()"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 27,
   "id": "9a2223c7",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "# 위에서 존재하는 object를 datetime으로 변환 필요\n",
    "# datetime을 쪼개어 시간 데이터로 정리\n",
    "# year, month, day, time\n",
    "\n",
    "bike_df['datetime'] = pd.to_datetime(bike_df['datetime']) # bike_df['datetime'].apply(pd.to_datetime)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 14,
   "id": "6cf984a9",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [
    {
     "ename": "NameError",
     "evalue": "name 'bike_df' is not defined",
     "output_type": "error",
     "traceback": [
      "\u001B[1;31m---------------------------------------------------------------------------\u001B[0m",
      "\u001B[1;31mNameError\u001B[0m                                 Traceback (most recent call last)",
      "\u001B[1;32m~\\AppData\\Local\\Temp/ipykernel_7364/2444852944.py\u001B[0m in \u001B[0;36m<module>\u001B[1;34m\u001B[0m\n\u001B[1;32m----> 1\u001B[1;33m \u001B[0mbike_df\u001B[0m\u001B[1;33m[\u001B[0m\u001B[1;34m'year'\u001B[0m\u001B[1;33m]\u001B[0m \u001B[1;33m=\u001B[0m \u001B[0mbike_df\u001B[0m\u001B[1;33m[\u001B[0m\u001B[1;34m'datetime'\u001B[0m\u001B[1;33m]\u001B[0m\u001B[1;33m.\u001B[0m\u001B[0mapply\u001B[0m\u001B[1;33m(\u001B[0m\u001B[1;32mlambda\u001B[0m \u001B[0mx\u001B[0m\u001B[1;33m:\u001B[0m \u001B[0mx\u001B[0m\u001B[1;33m.\u001B[0m\u001B[0myear\u001B[0m\u001B[1;33m)\u001B[0m\u001B[1;33m\u001B[0m\u001B[1;33m\u001B[0m\u001B[0m\n\u001B[0m\u001B[0;32m      2\u001B[0m \u001B[0mbike_df\u001B[0m\u001B[1;33m[\u001B[0m\u001B[1;34m'month'\u001B[0m\u001B[1;33m]\u001B[0m \u001B[1;33m=\u001B[0m \u001B[0mbike_df\u001B[0m\u001B[1;33m[\u001B[0m\u001B[1;34m'datetime'\u001B[0m\u001B[1;33m]\u001B[0m\u001B[1;33m.\u001B[0m\u001B[0mapply\u001B[0m\u001B[1;33m(\u001B[0m\u001B[1;32mlambda\u001B[0m \u001B[0mx\u001B[0m\u001B[1;33m:\u001B[0m \u001B[0mx\u001B[0m\u001B[1;33m.\u001B[0m\u001B[0mmonth\u001B[0m\u001B[1;33m)\u001B[0m\u001B[1;33m\u001B[0m\u001B[1;33m\u001B[0m\u001B[0m\n\u001B[0;32m      3\u001B[0m \u001B[0mbike_df\u001B[0m\u001B[1;33m[\u001B[0m\u001B[1;34m'day'\u001B[0m\u001B[1;33m]\u001B[0m \u001B[1;33m=\u001B[0m \u001B[0mbike_df\u001B[0m\u001B[1;33m[\u001B[0m\u001B[1;34m'datetime'\u001B[0m\u001B[1;33m]\u001B[0m\u001B[1;33m.\u001B[0m\u001B[0mapply\u001B[0m\u001B[1;33m(\u001B[0m\u001B[1;32mlambda\u001B[0m \u001B[0mx\u001B[0m\u001B[1;33m:\u001B[0m \u001B[0mx\u001B[0m\u001B[1;33m.\u001B[0m\u001B[0mday\u001B[0m\u001B[1;33m)\u001B[0m\u001B[1;33m\u001B[0m\u001B[1;33m\u001B[0m\u001B[0m\n\u001B[0;32m      4\u001B[0m \u001B[0mbike_df\u001B[0m\u001B[1;33m[\u001B[0m\u001B[1;34m'hour'\u001B[0m\u001B[1;33m]\u001B[0m \u001B[1;33m=\u001B[0m \u001B[0mbike_df\u001B[0m\u001B[1;33m[\u001B[0m\u001B[1;34m'datetime'\u001B[0m\u001B[1;33m]\u001B[0m\u001B[1;33m.\u001B[0m\u001B[0mapply\u001B[0m\u001B[1;33m(\u001B[0m\u001B[1;32mlambda\u001B[0m \u001B[0mx\u001B[0m\u001B[1;33m:\u001B[0m \u001B[0mx\u001B[0m\u001B[1;33m.\u001B[0m\u001B[0mhour\u001B[0m\u001B[1;33m)\u001B[0m\u001B[1;33m\u001B[0m\u001B[1;33m\u001B[0m\u001B[0m\n",
      "\u001B[1;31mNameError\u001B[0m: name 'bike_df' is not defined"
     ]
    }
   ],
   "source": [
    "bike_df['year'] = bike_df['datetime'].apply(lambda x: x.year)\n",
    "bike_df['mbonth'] = bike_df['datetime'].apply(lambda x: x.month)\n",
    "bike_df['day'] = bike_df['datetime'].apply(lambda x: x.day)\n",
    "bike_df['hour'] = bike_df['datetime'].apply(lambda x: x.hour)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 15,
   "id": "843786de",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [
    {
     "ename": "NameError",
     "evalue": "name 'bike_df' is not defined",
     "output_type": "error",
     "traceback": [
      "\u001B[1;31m---------------------------------------------------------------------------\u001B[0m",
      "\u001B[1;31mNameError\u001B[0m                                 Traceback (most recent call last)",
      "\u001B[1;32m~\\AppData\\Local\\Temp/ipykernel_7364/3372990922.py\u001B[0m in \u001B[0;36m<module>\u001B[1;34m\u001B[0m\n\u001B[0;32m      1\u001B[0m \u001B[1;31m## 데이터 전처리가 어느정도 완료\u001B[0m\u001B[1;33m\u001B[0m\u001B[1;33m\u001B[0m\u001B[0m\n\u001B[0;32m      2\u001B[0m \u001B[1;33m\u001B[0m\u001B[0m\n\u001B[1;32m----> 3\u001B[1;33m \u001B[0mbike_df_new\u001B[0m \u001B[1;33m=\u001B[0m \u001B[0mbike_df\u001B[0m\u001B[1;33m.\u001B[0m\u001B[0mdrop\u001B[0m\u001B[1;33m(\u001B[0m\u001B[1;33m[\u001B[0m\u001B[1;34m'datetime'\u001B[0m\u001B[1;33m,\u001B[0m\u001B[1;34m'casual'\u001B[0m\u001B[1;33m,\u001B[0m\u001B[1;34m'registered'\u001B[0m\u001B[1;33m]\u001B[0m\u001B[1;33m,\u001B[0m\u001B[0maxis\u001B[0m\u001B[1;33m=\u001B[0m\u001B[1;36m1\u001B[0m\u001B[1;33m)\u001B[0m\u001B[1;33m\u001B[0m\u001B[1;33m\u001B[0m\u001B[0m\n\u001B[0m\u001B[0;32m      4\u001B[0m \u001B[0mbike_df_new\u001B[0m\u001B[1;33m\u001B[0m\u001B[1;33m\u001B[0m\u001B[0m\n",
      "\u001B[1;31mNameError\u001B[0m: name 'bike_df' is not defined"
     ]
    }
   ],
   "source": [
    "## 데이터 전처리가 어느정도 완료\n",
    "\n",
    "bike_df_new = bike_df.drop(['datetime','casual','registered'],axis=1)\n",
    "bike_df_new"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "a54a1114",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "bike_df_new['count'].hist()"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "bc1ab29e",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "# 회귀평가지표 :: RMSLE, RMSE\n",
    "# 위에서 y데이터를 histogram으로 확인해 보니\n",
    "# 오른쪽 꼬리가 긴 형태를 지닌다.\n",
    "\n",
    "## 따라서 이를 조금 더 scaling 해주고자 log를 취하고 1을 더해줄 것이다.\n",
    "# 위의 식은 np.log1p()함수를 사용하면 쉽게 구현이 가능하다... \n",
    "\n",
    "def rmsle(y_test,pred):\n",
    "    log_y = np.log1p(y_test) # actual_y :: log1p를 해주는 이유_\n",
    "                             # infinity 문제를 해결하기 위해...\n",
    "    \n",
    "    log_pred = np.log1p(pred) # y_pred\n",
    "    squared_log_error1 = (log_y- log_pred)**2 # 실제값과 예측값의 차이는 y개수만큼\n",
    "    mean_squared_log_error1 = np.mean(squared_log_error1)\n",
    "    rmsle_result = np.sqrt(mean_squared_log_error1)\n",
    "    \n",
    "    return rmsle_result\n",
    "    "
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "113d89ae",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "### RMSE 평가지표 함수화\n",
    "def rmse(y_test, pred):\n",
    "    rmse_result = np.sqrt(mean_squared_error(y_test,pred))\n",
    "    return rmse_result"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "65461ac7",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "# RMSLE와 RMSE의 지표를 합쳐서 함수화해보자.\n",
    "def get_eval_index(y_test,pred):\n",
    "    rmsle_eval = rmsle(y_test,pred)\n",
    "    rmse_eval = rmse(y_test,pred)\n",
    "    # mean_absolute_error도 포함 _우리가 보기 쉽게\n",
    "    mae_eval = mean_absolute_error(y_test,pred)\n",
    "    print('RMSLE:{0:.4f}, RMSE:{1:.4f}, MAE:{2:.4f}'.format(rmsle_eval,rmse_eval,\n",
    "                                                           mae_eval))"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "6f5f3569",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "# data_split by using train_test_split\n",
    "# y값을 설정\n",
    "from sklearn.model_selection import train_test_split\n",
    "\n",
    "\n",
    "y_target = bike_df_new['count']\n",
    "X_ftrs = bike_df_new.drop(['count'], axis=1)\n",
    "\n",
    "## 데이터 분할 :: train_test_split\n",
    "\n",
    "xtrain, xval, ytrain, yval = train_test_split(X_ftrs, y_target,\n",
    "                                             test_size=0.3,\n",
    "                                             random_state=0)\n",
    "# 단순선형회귀분석\n",
    "\n",
    "lr_reg = LinearRegression()\n",
    "lr_reg.fit(xtrain,ytrain)\n",
    "pred_lr_reg = lr_reg.predict(xval)\n",
    "\n",
    "get_eval_index(yval, pred_lr_reg)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "d51628c1",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "### 지표를 체감하기 위해\n",
    "## check_df라는 것을 만들어본다.\n",
    "\n",
    "check_df = pd.DataFrame(yval.values, columns=['actual_y'])\n",
    "check_df['pred_y'] = pred_lr_reg\n",
    "check_df['diff'] = np.abs(check_df['pred_y']-check_df['actual_y'])\n",
    "check_df.sort_values(by='diff', ascending=False).reset_index()[:10]"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "952307ed",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "### yval.hist를 통해 분포를 확인\n",
    "## 이 분포가 오른쪽 꼬리가 길다라는 것을 확인\n",
    "\n",
    "yval.hist()"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "1b90c2d1",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "# log_scaling\n",
    "log1p_yval = np.log1p(yval)\n",
    "log1p_yval.hist()"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "68040e88",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "### y_target을 log1p를 통해\n",
    "### 전체 log_scaling을 시도\n",
    "\n",
    "y_target_log1p = np.log1p(y_target) # log_scaling 후의 y_target\n",
    "\n",
    "from sklearn.model_selection import train_test_split\n",
    "\n",
    "# y_target = bike_df_new['count']\n",
    "# 위의 원본 y값이 아닌 스케일링 후의 log_y를 대입\n",
    "\n",
    "y_target_log1p = np.log1p(y_target)\n",
    "X_ftrs = bike_df_new.drop(['count'], axis=1)\n",
    "\n",
    "## 데이터 분할 :: train_test_split\n",
    "xtrain, xval, ytrain_log, yval_log = train_test_split(X_ftrs, y_target_log1p,\n",
    "                                             test_size=0.3,\n",
    "                                             random_state=0)\n",
    "# 단순선형회귀분석\n",
    "\n",
    "lr_reg = LinearRegression()\n",
    "lr_reg.fit(xtrain,ytrain_log)\n",
    "pred_lr1_reg = lr_reg.predict(xval) # 로그화가 진행된 y_pred가\n",
    "\n",
    "# 위에서 log를 통해 스케일링을 한\n",
    "# yval_log를 원상복귀 시킴 \n",
    "yval_exp = np.expm1(yval_log)\n",
    "\n",
    "## 그 이후 원상태의 y_pred :: pred_lr1_reg VS yval_log를 원상복귀\n",
    "pred_lr1_exp = np.expm1(pred_lr1_reg)\n",
    "\n",
    "get_eval_index(yval_exp, pred_lr1_exp)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "4d28ff29",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "# RMSLE는 줄어들었으나\n",
    "# RMSE는 오히려 늘어났다. 즉, 오차값이 늘었다는 것이다\n",
    "# 이에 이 이유를 규명해보고자 시각화를 살펴보자"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "bfd2382a",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "coef = pd.Series(lr_reg.coef_, index=X_ftrs.columns)\n",
    "coef_sorted = coef.sort_values(ascending=False)\n",
    "sns.barplot(x=coef_sorted.values, y=coef_sorted.index)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "e649b7c4",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "# year는 연도를 의미하므로... 범주형자료의 느낌\n",
    "# 그런데 지금 해당데이터에는 데이터 크기에 따른 \n",
    "# 가중치(weight = coef = 계수)가 크게 부여가 됨\n",
    "\n",
    "bike_df_new['year'].value_counts()"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "385cadc5",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "X_ftrs.info()"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "87bd37cb",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "['year','month','day','hour','holiday',\n",
    "'workingday','season','weather']"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "22237029",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "# 위의 데이터들 중 범주형 자료의 경우\n",
    "# 원핫 인코딩을 통해 feature들을 전처리 해줌\n",
    "\n",
    "X_ftrs_oh = pd.get_dummies(X_ftrs, columns=['year','month','day','hour','holiday',\n",
    "'workingday','season','weather'])"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "ab6fc00c",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "## 원핫 인코딩이된 X_ftrs\n",
    "X_ftrs_oh\n",
    "\n",
    "### y_target을 log1p를 통해\n",
    "### 전체 log_scaling을 시도\n",
    "y_target_log1p = np.log1p(y_target) # log_scaling 후의 y_target\n",
    "\n",
    "\n",
    "### 여러분들이 하실 일~!\n",
    "## 알고리즘 적용 및\n",
    "## 위에서 설정해둔 회귀지표로 평가까지 진행~! \n",
    "\n",
    "\n",
    "# Ridge, Lasso, LinearRegression 적용\n",
    "\n",
    "# Tree계열 적용 - RandomForestRegressor, LGBMRegressor\n",
    "#               - GradientBoostingRegressor "
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "e9f43e5b",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "# end of_preprocessing"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "e9a5984f",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "### 전처리된 데이터들로 다시금 분할하여\n",
    "## 새로운 모델을 학습해본다.\n",
    "## 이번에는 선형모델외에 Ridge와 Lasso를 모두 적용하여\n",
    "# 선형기반의 회귀분석을 진행해본다.\n",
    "\n",
    "## 원핫 인코딩이된 X_ftrs\n",
    "X_ftrs_oh\n",
    "\n",
    "### y_target을 log1p를 통해\n",
    "### 전체 log_scaling을 시도\n",
    "y_target_log1p = np.log1p(y_target) # log_scaling 후의 y_target\n",
    "\n",
    "xtrain2, xval2, ytrain2, yval2 = train_test_split(X_ftrs_oh, y_target_log1p,\n",
    "                                               test_size=0.3, random_state=0)\n",
    "\n",
    "# Ridge와 Lasso 호출\n",
    "from sklearn.linear_model import Ridge\n",
    "from sklearn.linear_model import Lasso\n",
    "\n",
    "lr_reg = LinearRegression()\n",
    "ridge = Ridge(alpha= 10) # L2 제곱해서 더한다...\n",
    "lasso = Lasso(alpha= 0.001) # L1 절대값으로 더한다...\n",
    "\n",
    "models = [lr_reg, ridge, lasso]\n",
    "\n",
    "\n",
    "for model in models:\n",
    "    model.fit(xtrain2,ytrain2)\n",
    "    pred= model.predict(xval2)\n",
    "    yval_exp1 = np.expm1(yval2)\n",
    "    pred_exp1 = np.expm1(pred)\n",
    "    print('\\n ###', model.__class__.__name__, '### \\n')   \n",
    "    get_eval_index(yval_exp1, pred_exp1)   "
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "f1941bb4",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "# one_hot_encoding 이후를 시각화를 진행\n",
    "# ridge :: L2규제\n",
    "coef = pd.Series(ridge.coef_, index=X_ftrs_oh.columns)\n",
    "coef_sorted_r = coef.sort_values(ascending=False)[:11]\n",
    "coef_sorted_r\n",
    "\n",
    "sns.barplot(x=coef_sorted_r.values, y= coef_sorted_r.index)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "217e2667",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "# one_hot_encoding 이후를 시각화를 진행\n",
    "# Lasso :: L1규제\n",
    "coef_l = pd.Series(lasso.coef_, index=X_ftrs_oh.columns)\n",
    "coef_sorted_l = coef.sort_values(ascending=False)[:11]\n",
    "coef_sorted_l\n",
    "\n",
    "sns.barplot(x=coef_sorted_l.values, y= coef_sorted_l.index)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "37b724ac",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "### RandomForestRegressor 적용\n",
    "from sklearn.ensemble import RandomForestRegressor\n",
    "\n",
    "# 모델로 평가지표 분석\n",
    "rf_reg = RandomForestRegressor(n_estimators=500)\n",
    "\n",
    "rf_reg.fit(xtrain2,ytrain2)\n",
    "pred_rf = rf_reg.predict(xval2)\n",
    "\n",
    "# y 원상복귀 \n",
    "yval_expm1_rf = np.expm1(yval2)\n",
    "\n",
    "# pred 원상복귀 \n",
    "pred_expm1_rf = np.expm1(pred_rf)\n",
    "\n",
    "get_eval_index(yval_expm1_rf,pred_expm1_rf)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "11215739",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "### LGBMRegressor를 활용하여 \n",
    "### 위의 지표 확인 :: 수치를 적어본다. \n",
    "### 아마 랜포보다 더 좋은 수치를 기대.. "
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 5,
   "id": "d0d31704",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "### test 데이터를 통해 다시금 \n",
    "### 위의 지표 확인"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 117,
   "id": "4a140c06",
   "metadata": {
    "pycharm": {
     "name": "#%%\n"
    }
   },
   "outputs": [],
   "source": [
    "# end of files -- 22.06.20"
   ]
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Python 3 (ipykernel)",
   "language": "python",
   "name": "python3"
  },
  "language_info": {
   "codemirror_mode": {
    "name": "ipython",
    "version": 3
   },
   "file_extension": ".py",
   "mimetype": "text/x-python",
   "name": "python",
   "nbconvert_exporter": "python",
   "pygments_lexer": "ipython3",
   "version": "3.9.7"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 5
}