package main.java.com.makkkkkkkkks.builder;

public interface IBuilder {
    IBuilder setAge(int age);

    IBuilder setName(String name);

    <T> T build();
}
