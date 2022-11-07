public class Main {
    public static String decode(String msg) {
        int keyNumber = msg.length() / 2;
        String msgCode = msg.substring(5, 5 + keyNumber);
        String msgReplace = msgCode.replace("@#?", " ");

        return new StringBuilder(msgReplace).reverse().toString();
    }
    public static void main(String[] args) {
        String[] message = {
             "0@sn9sirppa@#?ia'jgtvryko1" ,
             "q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj",
             "aopi?sedohtém@#?sedhtmg+p9l!"
        };

        for (int i = 0; i < message.length; i++) {
            System.out.println(decode(message[i]));
        }
    }
}