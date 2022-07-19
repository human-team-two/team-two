package Moster_B;

import Items.Items;
import Items.Sword;
import Items.Wand;
import Monster_In.GorilaM;
import Monster_In.Monster;
import Monster_In.TigerM;
import Monster_In.dogM;

import java.util.Scanner;

public class Monst_D {

    int exit = 0; //게임 종료

    public void Deon(){
        Monster monster_D = new dogM("개", 100, 10);
        Monster monster_G = new GorilaM("고릴라", 500, 100);
        Monster monster_T = new TigerM("호랑이", 1000, 150);
        Items item_S = new Sword("검", 10, "전사");
        Items item_W = new Wand("지팡이", 10, "마법사");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt() ; // 게임 진행 : 라운드


        while (true){
            switch (count){
                case 1 :
                    monster_D.create(); //몬스터 생성
                    monster_D.showInfo(); // 몬스터 현재 상태
                    break;
                case 2 ://
                    monster_G.create();
                    monster_G.showInfo();
                    break;
                case 3 :
                    monster_D.create();
                    monster_T.showInfo();
                    break;
                case 4 :
                    break;
                case 5 :
                    break;
                case 6 : //게임종료
                    exit = -1;
                    System.out.println("프로그램 종료");
                    break;
                case 7 : //잘못 눌렀을 때?
                    System.out.println("다시 입력해주세요.");
                    Deon();
                    break;
            }
        }

    }
    public static void main(String[] args){
        Monst_D monst_d = new Monst_D();
        monst_d.Deon();

    }


}
