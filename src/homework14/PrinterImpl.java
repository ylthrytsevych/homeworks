package homework14;

public class PrinterImpl implements Printer {

    @Override
    public void print(Message mess) {
        String sender = mess.getSender();
        String text = mess.getText();

        if ((sender != null && !sender.isEmpty()) && (text != null && !text.isEmpty())) {
            System.out.println("Користувач " + sender + " відправив повідомлення: " + text);
        }

        else if ((sender == null || sender.isEmpty()) && (text != null && !text.isEmpty())){
            System.out.println("Анонімний користувач відправив повідомлення: " + text);
        }

        else if((sender == null || sender.isEmpty()) && (text == null || text.isEmpty())){

            //!!!!!!!!!!!!  ЦЕ НЕ АНОНІМНИЙ КЛАС - ЦЕ ЛОКАЛЬНИЙ. ДЛЯ АНОНІМНОГО ТРЕБА МАТИ РЕАЛІЗАЦІЮ ІНТЕРФЕЙСУ
//            class AnonClass{
//                public static void loader(){
//                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
//                }
//            }
//            AnonClass.loader();

            AnonInterface anon = new AnonInterface(){
                @Override
                public void printAnon() {
                    System.out.println("Опрацьовується пусте повідомлення від анонімного користувача...");
                }
            };
            anon.printAnon();
        }
        else{
            System.out.println("невідомий сценарій друку");
        }
    }

    public static class Message {
        private String text;
        private String sender;

        public Message(String sender, String text) {
            this.sender = sender;
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }
}
