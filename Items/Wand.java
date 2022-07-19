package Items;

import java.util.ArrayList;

public class Wand implements Items {
    String name;
    int dmg;
    String class_T;

    public Wand(String name, int dmg,String class_T){
        this.name = name;
        this.dmg = dmg;
        this.class_T = class_T;
    }


    @Override
    public int Hit() { // 랜덤공격
        int dmg;
        //랜덤으로 몬스터에게 데미지를 준다.
        double r = Math.random();
        // 최대값 20 ~ 1의 데미지를 준다.(제대로보면 1~20까지 데미지임)
        dmg = (int)(r * 100) + 1;
        //데미지가 1보다 크거나 같을 때 데미지 성공 아니면 실패
        if(dmg >= 1){
            System.out.println("공격에 성공");
            System.out.println(dmg + " 공격 ");
        }else{
            System.out.println("공격에 실패");
            dmg = 0;
        }
        return dmg;
    }

    @Override
    public void showInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("무기 클래스 : " + this.class_T);
    }

    @Override
    public void create() {
        ArrayList<String> name_W = new ArrayList<>();
        name_W.add("기본 지팡이");
        name_W.add("철 지팡이");
        name_W.add("금 지팡이");
        name_W.add("다이아 지팡이");
        System.out.println("어떤식으로 들어감? : "+name_W);
        int index_W = (int)(Math.random() * (name_W.size()-1));
        Wand wand = new Wand(name_W.get(index_W), Hit(),"마법사");
        wand.showInfo();

    }
    public static void main(String[] args){
        Wand wand = new Wand("지팡이", 10,"마법사");
        wand.create();

    }
}
