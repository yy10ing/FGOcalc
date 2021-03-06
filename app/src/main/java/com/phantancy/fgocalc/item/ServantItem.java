package com.phantancy.fgocalc.item;


import com.phantancy.fgocalc.R;

/**
 * Created by PY on 2016/12/1.
 */
public class ServantItem extends Item{

    private int layoutId = R.layout.item_servant;
    private String name,nickname,class_type,trump_color;
    private int id,star, arts_hit,buster_hit,quick_hit,ex_hit,solid_buff,buster_num,
            arts_num,quick_num;
    private double quick_na,arts_na,buster_na,ex_na,trump_na,nd,arts_buff,buster_buff,quick_buff,
            atk_buff,special_buff,critical_buff,star_occur,trump_lv1,trump_lv2,trump_lv3,trump_lv4,trump_lv5;

    public void setLayoutId(int id){
        layoutId = id;
    }

    @Override
    public int getItemLayoutId() {
        return layoutId;
    }

    public int getLayoutId() {
        return layoutId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getClass_type() {
        return class_type;
    }

    public void setClass_type(String class_type) {
        this.class_type = class_type;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getArts_hit() {
        return arts_hit;
    }

    public void setArts_hit(int arts_hit) {
        this.arts_hit = arts_hit;
    }

    public int getBuster_hit() {
        return buster_hit;
    }

    public void setBuster_hit(int buster_hit) {
        this.buster_hit = buster_hit;
    }

    public int getQuick_hit() {
        return quick_hit;
    }

    public void setQuick_hit(int quick_hit) {
        this.quick_hit = quick_hit;
    }

    public int getEx_hit() {
        return ex_hit;
    }

    public void setEx_hit(int ex_hit) {
        this.ex_hit = ex_hit;
    }

    public int getSolid_buff() {
        return solid_buff;
    }

    public void setSolid_buff(int solid_buff) {
        this.solid_buff = solid_buff;
    }

    public double getQuick_na() {
        return quick_na;
    }

    public void setQuick_na(double quick_na) {
        this.quick_na = quick_na;
    }

    public double getArts_na() {
        return arts_na;
    }

    public void setArts_na(double arts_na) {
        this.arts_na = arts_na;
    }

    public double getBuster_na() {
        return buster_na;
    }

    public void setBuster_na(double buster_na) {
        this.buster_na = buster_na;
    }

    public double getEx_na() {
        return ex_na;
    }

    public void setEx_na(double ex_na) {
        this.ex_na = ex_na;
    }

    public double getTrump_na() {
        return trump_na;
    }

    public void setTrump_na(double trump_na) {
        this.trump_na = trump_na;
    }

    public double getNd() {
        return nd;
    }

    public void setNd(double nd) {
        this.nd = nd;
    }

    public double getArts_buff() {
        return arts_buff;
    }

    public void setArts_buff(double arts_buff) {
        this.arts_buff = arts_buff;
    }

    public double getBuster_buff() {
        return buster_buff;
    }

    public void setBuster_buff(double buster_buff) {
        this.buster_buff = buster_buff;
    }

    public double getQuick_buff() {
        return quick_buff;
    }

    public void setQuick_buff(double quick_buff) {
        this.quick_buff = quick_buff;
    }

    public double getAtk_buff() {
        return atk_buff;
    }

    public void setAtk_buff(double atk_buff) {
        this.atk_buff = atk_buff;
    }

    public double getSpecial_buff() {
        return special_buff;
    }

    public void setSpecial_buff(double special_buff) {
        this.special_buff = special_buff;
    }

    public double getCritical_buff() {
        return critical_buff;
    }

    public void setCritical_buff(double critical_buff) {
        this.critical_buff = critical_buff;
    }

    public String getTrump_color() {
        return trump_color;
    }

    public void setTrump_color(String trump_color) {
        this.trump_color = trump_color;
    }

    public int getBuster_num() {
        return buster_num;
    }

    public void setBuster_num(int buster_num) {
        this.buster_num = buster_num;
    }

    public int getArts_num() {
        return arts_num;
    }

    public void setArts_num(int arts_num) {
        this.arts_num = arts_num;
    }

    public int getQuick_num() {
        return quick_num;
    }

    public void setQuick_num(int quick_num) {
        this.quick_num = quick_num;
    }

    public double getStar_occur() {
        return star_occur;
    }

    public void setStar_occur(double star_occur) {
        this.star_occur = star_occur;
    }

    public double getTrump_lv1() {
        return trump_lv1;
    }

    public void setTrump_lv1(double trump_lv1) {
        this.trump_lv1 = trump_lv1;
    }

    public double getTrump_lv2() {
        return trump_lv2;
    }

    public void setTrump_lv2(double trump_lv2) {
        this.trump_lv2 = trump_lv2;
    }

    public double getTrump_lv3() {
        return trump_lv3;
    }

    public void setTrump_lv3(double trump_lv3) {
        this.trump_lv3 = trump_lv3;
    }

    public double getTrump_lv4() {
        return trump_lv4;
    }

    public void setTrump_lv4(double trump_lv4) {
        this.trump_lv4 = trump_lv4;
    }

    public double getTrump_lv5() {
        return trump_lv5;
    }

    public void setTrump_lv5(double trump_lv5) {
        this.trump_lv5 = trump_lv5;
    }
}
