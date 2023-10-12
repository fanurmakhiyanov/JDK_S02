package ru.geekbrains.lesson02;

/**
 * Дописать третье задание таким образом, чтобы в идентификатор типа Developer записывался объект Frontender,
 * и далее вызывался метод developGUI(), * не изменяя существующие интерфейсы, только код основного класса.
 */

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FullStack dev = new DeveloperFull();
        BackEnder backDev = new DeveloperBack();
        List<BackEnder> devList = Arrays.asList(dev, backDev);

        for (BackEnder e: devList) {
            e.createServer();
        }

//        Developer dev = new FrontendDeveloper();
//        if (dev instanceof Frontender) {
//        ((Frontender) dev).developGUI();

//        dev.createServer();
//        dev.createFront();
//        backDev.createServer();
    }
}

interface BackEnder {
    void createServer();
}

interface FrontEnder {
    void createFront();
}

interface FullStack extends BackEnder, FrontEnder {

}

class DeveloperFull implements FullStack {

    @Override
    public void createServer() {
        System.out.println("Сделали сервер");
    }

    @Override
    public void createFront() {
        System.out.println("Покрасили кнопку в красный");
    }
}

class DeveloperBack implements BackEnder{

    @Override
    public void createServer() {
        System.out.println("Уронили сервер");
    }
}

//    Developer dev = new FrontendDeveloper();
//if (dev instanceof Frontender) {
//        ((Frontender) dev).developGUI();

