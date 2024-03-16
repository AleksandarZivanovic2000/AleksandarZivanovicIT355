package com.sun.mail;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        OblikServis oblikServis = context.getBean(OblikServis.class);
        Kvadrat kvadrat = context.getBean(Kvadrat.class);
        Krug krug = context.getBean(Krug.class);
        JednakostranicniTrougao jednakostranicniTrougao = context.getBean(JednakostranicniTrougao.class);

        System.out.println("Obim kvadrata: " + oblikServis.izracunajObim(kvadrat));
        System.out.println("Povrsina kvadrata: " + oblikServis.izracunajPovrsinu(kvadrat));

        System.out.println("Obim kruga: " + oblikServis.izracunajObim(krug));
        System.out.println("Povrsina kruga: " + oblikServis.izracunajPovrsinu(krug));

        System.out.println("Obim jednakostranicnog trougla: " + oblikServis.izracunajObim(jednakostranicniTrougao));
        System.out.println("Povrsina jednakostranicnog trougla: " + oblikServis.izracunajPovrsinu(jednakostranicniTrougao));

        kvadrat.setA(-1);
        krug.setR(-2);
        jednakostranicniTrougao.setA(-3);

    }
}