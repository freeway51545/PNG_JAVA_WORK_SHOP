package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_��������;
public abstract class ��������_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_selected(String a,MSG_ZHW msg);
   public abstract void _F_SAVE(MSG_ZHW msg);
   public abstract void _F_ENTER(MSG_ZHW msg);
   public abstract void _F_��һҳ(MSG_ZHW msg);
   public abstract void _F_��һҳ(MSG_ZHW msg);
   public abstract void _F_SELECT(String a,MSG_ZHW msg);
     final static int ST_��������= 3037;
boolean IS_ST_��������(){ return ST_��������==STATE;}
final static int ��������_����2= 23260;
final static int ��������_����2_RELEASE=  23261;
final static int ��������_����2_PRESSING=  23262;
final static int  ��������_����2_PRESSED=  23263;
final static int  ��������_����2_ENTER=  23264;
final static int  ��������_����2_LEAVE=  23265;

final static int ��������_����3= 23270;
final static int ��������_����3_RELEASE=  23271;
final static int ��������_����3_PRESSING=  23272;
final static int  ��������_����3_PRESSED=  23273;
final static int  ��������_����3_ENTER=  23274;
final static int  ��������_����3_LEAVE=  23275;

final static int ��������_8033= 23280;
final static int ��������_8033_RELEASE=  23281;
final static int ��������_8033_PRESSING=  23282;
final static int  ��������_8033_PRESSED=  23283;
final static int  ��������_8033_ENTER=  23284;
final static int  ��������_8033_LEAVE=  23285;

final static int ��������_֧��= 23290;
final static int ��������_֧��_RELEASE=  23291;
final static int ��������_֧��_PRESSING=  23292;
final static int  ��������_֧��_PRESSED=  23293;
final static int  ��������_֧��_ENTER=  23294;
final static int  ��������_֧��_LEAVE=  23295;

final static int ��������_��֧��= 23300;
final static int ��������_��֧��_RELEASE=  23301;
final static int ��������_��֧��_PRESSING=  23302;
final static int  ��������_��֧��_PRESSED=  23303;
final static int  ��������_��֧��_ENTER=  23304;
final static int  ��������_��֧��_LEAVE=  23305;

final static int ��������_��= 23310;
final static int ��������_��_RELEASE=  23311;
final static int ��������_��_PRESSING=  23312;
final static int  ��������_��_PRESSED=  23313;
final static int  ��������_��_ENTER=  23314;
final static int  ��������_��_LEAVE=  23315;

final static int ��������_��= 23320;
final static int ��������_��_RELEASE=  23321;
final static int ��������_��_PRESSING=  23322;
final static int  ��������_��_PRESSED=  23323;
final static int  ��������_��_ENTER=  23324;
final static int  ��������_��_LEAVE=  23325;

final static int ��������_��= 23330;
final static int ��������_��_RELEASE=  23331;
final static int ��������_��_PRESSING=  23332;
final static int  ��������_��_PRESSED=  23333;
final static int  ��������_��_ENTER=  23334;
final static int  ��������_��_LEAVE=  23335;

final static int ��������_����= 23340;
final static int ��������_����_RELEASE=  23341;
final static int ��������_����_PRESSING=  23342;
final static int  ��������_����_PRESSED=  23343;
final static int  ��������_����_ENTER=  23344;
final static int  ��������_����_LEAVE=  23345;

final static int ��������_ͨ��= 23350;
final static int ��������_ͨ��_RELEASE=  23351;
final static int ��������_ͨ��_PRESSING=  23352;
final static int  ��������_ͨ��_PRESSED=  23353;
final static int  ��������_ͨ��_ENTER=  23354;
final static int  ��������_ͨ��_LEAVE=  23355;

final static int ��������_����= 23360;
final static int ��������_����_RELEASE=  23361;
final static int ��������_����_PRESSING=  23362;
final static int  ��������_����_PRESSED=  23363;
final static int  ��������_����_ENTER=  23364;
final static int  ��������_����_LEAVE=  23365;

final static int ��������_ȡ��= 23370;
final static int ��������_ȡ��_RELEASE=  23371;
final static int ��������_ȡ��_PRESSING=  23372;
final static int  ��������_ȡ��_PRESSED=  23373;
final static int  ��������_ȡ��_ENTER=  23374;
final static int  ��������_ȡ��_LEAVE=  23375;

final static int ��������_��һҳ= 23380;
final static int ��������_��һҳ_RELEASE=  23381;
final static int ��������_��һҳ_PRESSING=  23382;
final static int  ��������_��һҳ_PRESSED=  23383;
final static int  ��������_��һҳ_ENTER=  23384;
final static int  ��������_��һҳ_LEAVE=  23385;

final static int ��������_��һҳ= 23390;
final static int ��������_��һҳ_RELEASE=  23391;
final static int ��������_��һҳ_PRESSING=  23392;
final static int  ��������_��һҳ_PRESSED=  23393;
final static int  ��������_��һҳ_ENTER=  23394;
final static int  ��������_��һҳ_LEAVE=  23395;

final static int ��������_0= 23400;
final static int ��������_0_RELEASE=  23401;
final static int ��������_0_PRESSING=  23402;
final static int  ��������_0_PRESSED=  23403;
final static int  ��������_0_ENTER=  23404;
final static int  ��������_0_LEAVE=  23405;

final static int ��������_1= 23410;
final static int ��������_1_RELEASE=  23411;
final static int ��������_1_PRESSING=  23412;
final static int  ��������_1_PRESSED=  23413;
final static int  ��������_1_ENTER=  23414;
final static int  ��������_1_LEAVE=  23415;

final static int ��������_2= 23420;
final static int ��������_2_RELEASE=  23421;
final static int ��������_2_PRESSING=  23422;
final static int  ��������_2_PRESSED=  23423;
final static int  ��������_2_ENTER=  23424;
final static int  ��������_2_LEAVE=  23425;

final static int ��������_3= 23430;
final static int ��������_3_RELEASE=  23431;
final static int ��������_3_PRESSING=  23432;
final static int  ��������_3_PRESSED=  23433;
final static int  ��������_3_ENTER=  23434;
final static int  ��������_3_LEAVE=  23435;

final static int ��������_4= 23440;
final static int ��������_4_RELEASE=  23441;
final static int ��������_4_PRESSING=  23442;
final static int  ��������_4_PRESSED=  23443;
final static int  ��������_4_ENTER=  23444;
final static int  ��������_4_LEAVE=  23445;

final static int ��������_5= 23450;
final static int ��������_5_RELEASE=  23451;
final static int ��������_5_PRESSING=  23452;
final static int  ��������_5_PRESSED=  23453;
final static int  ��������_5_ENTER=  23454;
final static int  ��������_5_LEAVE=  23455;

final static int ��������_6= 23460;
final static int ��������_6_RELEASE=  23461;
final static int ��������_6_PRESSING=  23462;
final static int  ��������_6_PRESSED=  23463;
final static int  ��������_6_ENTER=  23464;
final static int  ��������_6_LEAVE=  23465;

final static int ��������_7= 23470;
final static int ��������_7_RELEASE=  23471;
final static int ��������_7_PRESSING=  23472;
final static int  ��������_7_PRESSED=  23473;
final static int  ��������_7_ENTER=  23474;
final static int  ��������_7_LEAVE=  23475;


public ��������_Event() {
      actionMap.putInt("����2",��������_����2);
      actionMap.putInt("����3",��������_����3);
      actionMap.putInt("8033",��������_8033);
      actionMap.putInt("֧��",��������_֧��);
      actionMap.putInt("��֧��",��������_��֧��);
      actionMap.putInt("��",��������_��);
      actionMap.putInt("��",��������_��);
      actionMap.putInt("��",��������_��);
      actionMap.putInt("����",��������_����);
      actionMap.putInt("ͨ��",��������_ͨ��);
      actionMap.putInt("����",��������_����);
      actionMap.putInt("ȡ��",��������_ȡ��);
      actionMap.putInt("��һҳ",��������_��һҳ);
      actionMap.putInt("��һҳ",��������_��һҳ);
      actionMap.putInt("0",��������_0);
      actionMap.putInt("1",��������_1);
      actionMap.putInt("2",��������_2);
      actionMap.putInt("3",��������_3);
      actionMap.putInt("4",��������_4);
      actionMap.putInt("5",��������_5);
      actionMap.putInt("6",��������_6);
      actionMap.putInt("7",��������_7);
	STATE= changeState(STATE,ST_��������);
	setBindScreen(new Screen_��������(),SCRN_��������);
}

public String getScreenName(){
	return  "��������";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_��������){
			if(msg.wParam==��������_����2_RELEASE){
				_F_selected("����2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_����3_RELEASE){
				_F_selected("����3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_8033_RELEASE){
				_F_selected("8033",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_֧��_RELEASE){
				_F_selected("֧��",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_��֧��_RELEASE){
				_F_selected("��֧��",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_��_RELEASE){
				_F_selected("��",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_��_RELEASE){
				_F_selected("��",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_��_RELEASE){
				_F_selected("��",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_����_RELEASE){
				_F_selected("����",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_ͨ��_RELEASE){
				_F_selected("ͨ��",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_����_RELEASE){
				_F_SAVE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_ȡ��_RELEASE){
				TO_SCRN(getSCRN_��������());
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_��һҳ_RELEASE){
				_F_��һҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_��һҳ_RELEASE){
				_F_��һҳ(msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_0_RELEASE){
				_F_SELECT("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_1_RELEASE){
				_F_SELECT("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_2_RELEASE){
				_F_SELECT("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_3_RELEASE){
				_F_SELECT("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_4_RELEASE){
				_F_SELECT("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_5_RELEASE){
				_F_SELECT("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_6_RELEASE){
				_F_SELECT("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==��������_7_RELEASE){
				_F_SELECT("7",msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
