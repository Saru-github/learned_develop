public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";

        // Base 64 encoding

        // url encoding

        Encoder encoder = new Encoder(new Base64Encoder());
        Encoder encoder2 = new Encoder(new UrlEncoder());   // 외부주입, Base32 를 만들려면 IEncoder 상속 후 생성
        String result = encoder.encode(url);
        System.out.println(result);

    }
}