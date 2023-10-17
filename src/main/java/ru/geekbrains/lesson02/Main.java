package ru.geekbrains.lesson02;

/**
 * Дописать третье задание таким образом, чтобы в идентификатор типа Developer записывался объект Frontender,
 * и далее вызывался метод developGUI(), * не изменяя существующие интерфейсы, только код основного класса.
 */

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ImplFullStack dev = new ImplFullStack();
        ImplBackEnd backEnd = new ImplBackEnd();

        List<BackEnder> list = List.of(dev,backEnd);
        list.stream().forEach(x -> x.createServer());

        Developer devFront = new FrontEnder(){
            @Override
            public void createFront() {
                System.out.println("Create Frontend");
            }
        };
        ((FrontEnder)devFront).createFront();

    }
}

interface BackEnder extends Developer{
    void createServer();
}

interface FrontEnder extends Developer{
    void createFront();
}

interface FullStack extends BackEnder, FrontEnder {
}

class ImplFullStack implements FullStack{

    @Override
    public void createServer() {
        System.out.println("Server start!");
    }

    @Override
    public void createFront() {
        System.out.println("Front start!");
    }
}

class ImplBackEnd implements BackEnder {

    @Override
    public void createServer() {
        System.out.println("Drop server");
    }
}

interface Developer{
}