package dataStructure;

public class MyHash2 {

    public static void main(String[] args) {
        MyHash2 mainObject1 = new MyHash2(20);
        mainObject1.saveData("HEO", "010-7262-7548");
        mainObject1.saveData("KIM", "010-1111-1111");
        mainObject1.saveData("LEE", "010-7262-7548");
        mainObject1.saveData("Lei", "010-3333-3333");
        System.out.println(mainObject1.getData("Lei"));
    }
    public Slot[] hashTable;
    public MyHash2(Integer size){
        this.hashTable = new Slot[size];
    }
    public class Slot{
        String key;
        String value;
        Slot(String key, String value){
            this.key = key;
            this.value = value;
        }
    }
    public int hashFunc(String key){
        return (int)(key.charAt(0))%this.hashTable.length;
    }
    public boolean saveData(String key, String value){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            if(this.hashTable[address].key != null){
                this.hashTable[address].value = value;
                return true;
            } else {
                Integer currAddress = address +1;
                while(this.hashTable[currAddress].key != null){
                    if(this.hashTable[currAddress].key == key){
                        this.hashTable[currAddress].value = value;
                        return true;
                    } else {
                        currAddress++;
                        if (currAddress >= this.hashTable.length){
                            return false;
                        }
                    }

                }
                this.hashTable[currAddress] = new Slot(key, value);
            }
        } else {
            this.hashTable[address] = new Slot(key, value);
        }
        return true;
    }
    public String getData(String key){
        Integer address = this.hashFunc(key);
        if(this.hashTable[address] != null){
            if(this.hashTable[address].key == key){
                return this.hashTable[address].value;
            } else {
                Integer currAddress = address + 1;
                while(this.hashTable[currAddress] != null){
                    if(this.hashTable[currAddress].key == key){
                        return this.hashTable[currAddress].value;
                    } else {
                        currAddress++;
                        if(currAddress >= this.hashTable.length){
                            return null;
                        }
                    }
                }
                return null;
            }
        } else {
            return null;
        }
    }
}
