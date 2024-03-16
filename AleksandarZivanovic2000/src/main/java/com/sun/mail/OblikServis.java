package com.sun.mail;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OblikServis {
    @Autowired
    private Kvadrat kvadrat;
    @Autowired
    private Krug krug;
    @Autowired
    private JednakostranicniTrougao jednakostranicniTrougao;

    public void setKvadrat(Kvadrat kvadrat) {
        this.kvadrat = kvadrat;
    }

    public void setKrug(Krug krug) {
        this.krug = krug;
    }

    public void setJednakostranicniTrougao(JednakostranicniTrougao jednakostranicniTrougao) {
        this.jednakostranicniTrougao = jednakostranicniTrougao;
    }

    public double izracunajObim(Oblik oblik) {
        return oblik.obim();
    }

    public double izracunajPovrsinu(Oblik oblik) {
        return oblik.povrsina();
    }
}
