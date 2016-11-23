package ru.urfu.state;

import ru.urfu.state.copymachine.Context;
import ru.urfu.state.copymachine.FlashPrint;
import ru.urfu.state.copymachine.WiFiPrint;

public class App {
    public static void main(String[] args) {

        Context context = new Context(10);

        FlashPrint flashPrint = new FlashPrint();
        try {
            flashPrint.doCase(context);
            flashPrint.doPrint(context);
            flashPrint.doTakeDelivery(context);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        context.setMoney(2);
        WiFiPrint wiFiPrint = new WiFiPrint();
        try {
            wiFiPrint.doCase(context);
            wiFiPrint.doPrint(context);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        try {
            wiFiPrint.doPrint(context);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        try {
            wiFiPrint.doTakeDelivery(context);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        try {
            wiFiPrint.doCase(context);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
