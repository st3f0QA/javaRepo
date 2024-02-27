public class gsmTest {
//        public gsmTest(String memory){
//        memory = ".";
//        String havte = "..";
//        this.array();
//            System.out.println(this.array());
//    }



    public void main(String[] args) {
        gsmTest test = new gsmTest();

        test.array();
        for (int i = 0; i < test.array().length; i++){
            test.phoneDetails(test.array()[i]);
            test.testAllCall(test.array()[i]);
           
        }
        this.array();

    }

    public String[] array(){
       String iphone = "iPhone";
       String pixel = "Pixel";
       String huawei = "Huawei";

        return new String[]{iphone,pixel,huawei};

    }
    public void phoneDetails(String phone){
        GSM gsm = new GSM();
        gsm.Model(phone);
    }
    public void testAllCall(String phone){
        GSM gsm = new GSM();
        gsm.allCall(phone);
    }

}
