package com.creational.AbstractFactory;


public class AbstractFactoryEverydayDemo {
    public static void main(String[] args){
//        String xml = "<document><body><stock>AAPL</stock></body></document>";
//        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());
//
//        DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
//        Document document = null;
//        DocumentBuilder factory = null;
//        try {
//            factory = abstractFactory.newDocumentBuilder();
//
//             document = factory.parse(bais);
//        }
//        catch (ParserConfigurationException e)
//        {
//            e.printStackTrace();
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        ((org.w3c.dom.Document) document).getDocumentElement().normalize();
//
//        System.out.println(((org.w3c.dom.Document) document).getDocumentElement().getNodeName());
//
//        System.out.println(abstractFactory.getClass());
//
//        System.out.println(factory.getClass());

        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(750);

        CreditCard creditCard = creditCardFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(creditCard.getClass());

        creditCardFactory = CreditCardFactory.getCreditCardFactory(600);

        creditCard = creditCardFactory.getCreditCard(CardType.GOLD);

        System.out.println(creditCard.getClass());

    }
}

