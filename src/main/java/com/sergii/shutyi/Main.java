package com.sergii.shutyi;


import com.sergii.shutyi.annotation.MyAnnotationAnalyzer;
import com.sergii.shutyi.model.HomeAnimal;

public class Main {
    public static void main(String[] args) throws Exception {
        HomeAnimal homeAnimal = new HomeAnimal("Cat", 4, 10, "Murzik");

        MyAnnotationAnalyzer analyzer = new MyAnnotationAnalyzer();
        analyzer.invokeMethods(HomeAnimal.class);
        analyzer.info(HomeAnimal.class);
    }
}
