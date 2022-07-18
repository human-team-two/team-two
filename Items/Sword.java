package Items;

import Monster_In.GorilaM;
import Monster_In.dogM;

import java.util.ArrayList;

public class Sword implements Items{
    String name;
    int dmg;
    String class_T;

    public  Sword(String name, int dmg,String class_T){
        this.name = name;
        this.dmg = dmg;
        this.class_T = class_T;
    }

    @Override
    //데미지
    public int Hit() { // 랜덤공격
        int dmg;
        //랜덤으로 몬스터에게 데미지를 준다.
        double r = Math.random();
        // 최대값 20 ~ 1의 데미지를 준다.(제대로보면 1~20까지 데미지임)
        dmg = (int)(r * 100) + 1;
        //데미지가 1보다 크거나 같을 때 데미지 성공 아니면 실패
        if(dmg >= 1){ 
            System.out.println("공격에 성공");
            System.out.println(dmg + " 공격");
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
        ArrayList<String> name_S = new ArrayList<>();
        name_S.add("기본 검");
        name_S.add("강철 검");
        name_S.add("빛나는 강철 검");
        name_S.add("엄청 빛나는 강철 검 ");
        System.out.println("어떤식으로 들어감? : "+name_S);
        int index_S = (int)(Math.random() * (name_S.size()-1));
        Sword sword = new Sword(name_S.get(index_S), Hit(),"전사");
        sword.showInfo();

    }
    public static void main(String[] args){
        Sword sword = new Sword("검", 10,"전사");
        sword.create();

    }
}
