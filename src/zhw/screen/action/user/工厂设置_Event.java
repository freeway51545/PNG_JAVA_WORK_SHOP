package zhw.screen.action.user;
import zhw.screen.action.BaseStateEventItem;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.user.Screen_工厂设置;
public abstract class 工厂设置_Event extends BaseStateEventItem {




              public void dispatch(MSG_ZHW msg){
                            _F_STATE_ROUTINE(msg);
              }

 int STATE;
   public abstract void _F_selected(String a,MSG_ZHW msg);
   public abstract void _F_SAVE(MSG_ZHW msg);
   public abstract void _F_ENTER(MSG_ZHW msg);
   public abstract void _F_上一页(MSG_ZHW msg);
   public abstract void _F_下一页(MSG_ZHW msg);
   public abstract void _F_SELECT(String a,MSG_ZHW msg);
     final static int ST_工厂设置= 3037;
boolean IS_ST_工厂设置(){ return ST_工厂设置==STATE;}
final static int 工厂设置_按键2= 23260;
final static int 工厂设置_按键2_RELEASE=  23261;
final static int 工厂设置_按键2_PRESSING=  23262;
final static int  工厂设置_按键2_PRESSED=  23263;
final static int  工厂设置_按键2_ENTER=  23264;
final static int  工厂设置_按键2_LEAVE=  23265;

final static int 工厂设置_按键3= 23270;
final static int 工厂设置_按键3_RELEASE=  23271;
final static int 工厂设置_按键3_PRESSING=  23272;
final static int  工厂设置_按键3_PRESSED=  23273;
final static int  工厂设置_按键3_ENTER=  23274;
final static int  工厂设置_按键3_LEAVE=  23275;

final static int 工厂设置_8033= 23280;
final static int 工厂设置_8033_RELEASE=  23281;
final static int 工厂设置_8033_PRESSING=  23282;
final static int  工厂设置_8033_PRESSED=  23283;
final static int  工厂设置_8033_ENTER=  23284;
final static int  工厂设置_8033_LEAVE=  23285;

final static int 工厂设置_支持= 23290;
final static int 工厂设置_支持_RELEASE=  23291;
final static int 工厂设置_支持_PRESSING=  23292;
final static int  工厂设置_支持_PRESSED=  23293;
final static int  工厂设置_支持_ENTER=  23294;
final static int  工厂设置_支持_LEAVE=  23295;

final static int 工厂设置_不支持= 23300;
final static int 工厂设置_不支持_RELEASE=  23301;
final static int 工厂设置_不支持_PRESSING=  23302;
final static int  工厂设置_不支持_PRESSED=  23303;
final static int  工厂设置_不支持_ENTER=  23304;
final static int  工厂设置_不支持_LEAVE=  23305;

final static int 工厂设置_是= 23310;
final static int 工厂设置_是_RELEASE=  23311;
final static int 工厂设置_是_PRESSING=  23312;
final static int  工厂设置_是_PRESSED=  23313;
final static int  工厂设置_是_ENTER=  23314;
final static int  工厂设置_是_LEAVE=  23315;

final static int 工厂设置_否= 23320;
final static int 工厂设置_否_RELEASE=  23321;
final static int 工厂设置_否_PRESSING=  23322;
final static int  工厂设置_否_PRESSED=  23323;
final static int  工厂设置_否_ENTER=  23324;
final static int  工厂设置_否_LEAVE=  23325;

final static int 工厂设置_无= 23330;
final static int 工厂设置_无_RELEASE=  23331;
final static int 工厂设置_无_PRESSING=  23332;
final static int  工厂设置_无_PRESSED=  23333;
final static int  工厂设置_无_ENTER=  23334;
final static int  工厂设置_无_LEAVE=  23335;

final static int 工厂设置_大众= 23340;
final static int 工厂设置_大众_RELEASE=  23341;
final static int 工厂设置_大众_PRESSING=  23342;
final static int  工厂设置_大众_PRESSED=  23343;
final static int  工厂设置_大众_ENTER=  23344;
final static int  工厂设置_大众_LEAVE=  23345;

final static int 工厂设置_通用= 23350;
final static int 工厂设置_通用_RELEASE=  23351;
final static int 工厂设置_通用_PRESSING=  23352;
final static int  工厂设置_通用_PRESSED=  23353;
final static int  工厂设置_通用_ENTER=  23354;
final static int  工厂设置_通用_LEAVE=  23355;

final static int 工厂设置_保存= 23360;
final static int 工厂设置_保存_RELEASE=  23361;
final static int 工厂设置_保存_PRESSING=  23362;
final static int  工厂设置_保存_PRESSED=  23363;
final static int  工厂设置_保存_ENTER=  23364;
final static int  工厂设置_保存_LEAVE=  23365;

final static int 工厂设置_取消= 23370;
final static int 工厂设置_取消_RELEASE=  23371;
final static int 工厂设置_取消_PRESSING=  23372;
final static int  工厂设置_取消_PRESSED=  23373;
final static int  工厂设置_取消_ENTER=  23374;
final static int  工厂设置_取消_LEAVE=  23375;

final static int 工厂设置_上一页= 23380;
final static int 工厂设置_上一页_RELEASE=  23381;
final static int 工厂设置_上一页_PRESSING=  23382;
final static int  工厂设置_上一页_PRESSED=  23383;
final static int  工厂设置_上一页_ENTER=  23384;
final static int  工厂设置_上一页_LEAVE=  23385;

final static int 工厂设置_下一页= 23390;
final static int 工厂设置_下一页_RELEASE=  23391;
final static int 工厂设置_下一页_PRESSING=  23392;
final static int  工厂设置_下一页_PRESSED=  23393;
final static int  工厂设置_下一页_ENTER=  23394;
final static int  工厂设置_下一页_LEAVE=  23395;

final static int 工厂设置_0= 23400;
final static int 工厂设置_0_RELEASE=  23401;
final static int 工厂设置_0_PRESSING=  23402;
final static int  工厂设置_0_PRESSED=  23403;
final static int  工厂设置_0_ENTER=  23404;
final static int  工厂设置_0_LEAVE=  23405;

final static int 工厂设置_1= 23410;
final static int 工厂设置_1_RELEASE=  23411;
final static int 工厂设置_1_PRESSING=  23412;
final static int  工厂设置_1_PRESSED=  23413;
final static int  工厂设置_1_ENTER=  23414;
final static int  工厂设置_1_LEAVE=  23415;

final static int 工厂设置_2= 23420;
final static int 工厂设置_2_RELEASE=  23421;
final static int 工厂设置_2_PRESSING=  23422;
final static int  工厂设置_2_PRESSED=  23423;
final static int  工厂设置_2_ENTER=  23424;
final static int  工厂设置_2_LEAVE=  23425;

final static int 工厂设置_3= 23430;
final static int 工厂设置_3_RELEASE=  23431;
final static int 工厂设置_3_PRESSING=  23432;
final static int  工厂设置_3_PRESSED=  23433;
final static int  工厂设置_3_ENTER=  23434;
final static int  工厂设置_3_LEAVE=  23435;

final static int 工厂设置_4= 23440;
final static int 工厂设置_4_RELEASE=  23441;
final static int 工厂设置_4_PRESSING=  23442;
final static int  工厂设置_4_PRESSED=  23443;
final static int  工厂设置_4_ENTER=  23444;
final static int  工厂设置_4_LEAVE=  23445;

final static int 工厂设置_5= 23450;
final static int 工厂设置_5_RELEASE=  23451;
final static int 工厂设置_5_PRESSING=  23452;
final static int  工厂设置_5_PRESSED=  23453;
final static int  工厂设置_5_ENTER=  23454;
final static int  工厂设置_5_LEAVE=  23455;

final static int 工厂设置_6= 23460;
final static int 工厂设置_6_RELEASE=  23461;
final static int 工厂设置_6_PRESSING=  23462;
final static int  工厂设置_6_PRESSED=  23463;
final static int  工厂设置_6_ENTER=  23464;
final static int  工厂设置_6_LEAVE=  23465;

final static int 工厂设置_7= 23470;
final static int 工厂设置_7_RELEASE=  23471;
final static int 工厂设置_7_PRESSING=  23472;
final static int  工厂设置_7_PRESSED=  23473;
final static int  工厂设置_7_ENTER=  23474;
final static int  工厂设置_7_LEAVE=  23475;


public 工厂设置_Event() {
      actionMap.putInt("按键2",工厂设置_按键2);
      actionMap.putInt("按键3",工厂设置_按键3);
      actionMap.putInt("8033",工厂设置_8033);
      actionMap.putInt("支持",工厂设置_支持);
      actionMap.putInt("不支持",工厂设置_不支持);
      actionMap.putInt("是",工厂设置_是);
      actionMap.putInt("否",工厂设置_否);
      actionMap.putInt("无",工厂设置_无);
      actionMap.putInt("大众",工厂设置_大众);
      actionMap.putInt("通用",工厂设置_通用);
      actionMap.putInt("保存",工厂设置_保存);
      actionMap.putInt("取消",工厂设置_取消);
      actionMap.putInt("上一页",工厂设置_上一页);
      actionMap.putInt("下一页",工厂设置_下一页);
      actionMap.putInt("0",工厂设置_0);
      actionMap.putInt("1",工厂设置_1);
      actionMap.putInt("2",工厂设置_2);
      actionMap.putInt("3",工厂设置_3);
      actionMap.putInt("4",工厂设置_4);
      actionMap.putInt("5",工厂设置_5);
      actionMap.putInt("6",工厂设置_6);
      actionMap.putInt("7",工厂设置_7);
	STATE= changeState(STATE,ST_工厂设置);
	setBindScreen(new Screen_工厂设置(),SCRN_工厂设置);
}

public String getScreenName(){
	return  "工厂设置";
};

 void _F_STATE_ROUTINE(MSG_ZHW msg){

		if (STATE == ST_工厂设置){
			if(msg.wParam==工厂设置_按键2_RELEASE){
				_F_selected("按键2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_按键3_RELEASE){
				_F_selected("按键3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_8033_RELEASE){
				_F_selected("8033",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_支持_RELEASE){
				_F_selected("支持",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_不支持_RELEASE){
				_F_selected("不支持",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_是_RELEASE){
				_F_selected("是",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_否_RELEASE){
				_F_selected("否",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_无_RELEASE){
				_F_selected("无",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_大众_RELEASE){
				_F_selected("大众",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_通用_RELEASE){
				_F_selected("通用",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_保存_RELEASE){
				_F_SAVE(msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_取消_RELEASE){
				TO_SCRN(getSCRN_参数设置());
				msg.setComsumered();
			}
			if(msg.wParam==MSG_ZHW.MSG_ENTER_SCRN){
				_F_ENTER(msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_上一页_RELEASE){
				_F_上一页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_下一页_RELEASE){
				_F_下一页(msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_0_RELEASE){
				_F_SELECT("0",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_1_RELEASE){
				_F_SELECT("1",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_2_RELEASE){
				_F_SELECT("2",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_3_RELEASE){
				_F_SELECT("3",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_4_RELEASE){
				_F_SELECT("4",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_5_RELEASE){
				_F_SELECT("5",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_6_RELEASE){
				_F_SELECT("6",msg);
				msg.setComsumered();
			}
			if(msg.wParam==工厂设置_7_RELEASE){
				_F_SELECT("7",msg);
				msg.setComsumered();
			}
 //                IS_COMSUMED_RETURN(msg);
	}
	}
 void _F_ActionEvent(MSG_ZHW msg){
	}

};
