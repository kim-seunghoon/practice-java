package practice_list;

public class hobbang {
    public static void main(String[] args) {
        _hobbang h1 = new _hobbang();
        h1.content = "팥";
        h1.price = 600;
        System.out.println(h1.info());

        _hobbang h2 = new _hobbang();
        h1.content = "야채";
        h1.price = 700;
        System.out.println(h1.info());

        _hobbang h3 = new _hobbang();
        h1.content = "피자";
        h1.price = 700;
        System.out.println(h1.info());
    }
}

class _hobbang {
    String content;
    int price;

    String info(){
        return String.format("%s호빵 : %d원", content, price);
    }
}
