package learn.java2;

public class product {
    public String name;
    public int price;

    public product(String name,int price){
        this.name=name;
        this.price=price;
    }

    public product(){}


    public product(productBuilder Builder){
        this.name=Builder.name;
        this.price=Builder.price;
    }

    public static class productBuilder{
        public String name;
        public int price;

        public productBuilder(String name,int price){
            this.name=name;
            this.price=price;
        }
        public productBuilder(){}

        public productBuilder nameBuilder(String name){
            this.name=name;
            return this;
        }
        public productBuilder priceBuilder(int price){
            this.price=price;
            return this;
        }

        public product build(){
            return new product(this);
        }


    }
}

