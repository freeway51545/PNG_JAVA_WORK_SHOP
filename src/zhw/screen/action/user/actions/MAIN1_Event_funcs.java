package zhw.screen.action.user.actions;
import zhw.png.BASE_PNG_STRUCT;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.action.user.MAIN1_Event;
import android.graphics.Canvas;
public class MAIN1_Event_funcs extends MAIN1_Event {
	String iconNamesOrg[]={
			"导航","收音机","蓝牙","DVD",
			"SD卡","USB","设置","背景设置",
			"GPS信号","外部输入","IPOD","电视",
			"游戏","录音","图片","原车蓝牙USB","安吉星","仪表盘","音乐","电子书"
			};

    public  void _F_ENTER_MAIN1(MSG_ZHW msg){
    	System.out.println("enter main");
    	int x=0;
    	for(int i=0;i<iconNamesOrg.length;i++){
    		BASE_PNG_STRUCT pic=getBindScreen().findPng(iconNamesOrg[i]);
    		if(pic!=null){
    			int xLoc=x%5;
    			int yLoc=x/5;
    			pic.xLoc=xLoc*140+40;
    			pic.yLoc=yLoc*140+40;
    			x++;
    		}
    	}
    };

    public  void _F_ENTER_NORMAL_STATE(MSG_ZHW msg){
    };

    public  void _F_MAIN_TIMMER(MSG_ZHW msg){
    };

    public  void _F_RE_MAKE_ICONS(MSG_ZHW msg){
    };

    public  void _F_PAGE1(MSG_ZHW msg){
    };

    public  void _F_PAGE2(MSG_ZHW msg){
    };

    public  void _F_PAGE3(MSG_ZHW msg){
    };

    public  void _F_解锁(MSG_ZHW msg){
    };

    public  void _F_锁定(MSG_ZHW msg){
    };

    public  void _F_语言设置(MSG_ZHW msg){
    };

    public  void _F_CALL_IPOD(MSG_ZHW msg){
    };

    public  void _F_CALL_电视(MSG_ZHW msg){
    };

    public  void _F_CALL_GPS信号(MSG_ZHW msg){
    };

    public  void _F_CALL_安吉星(MSG_ZHW msg){
    };

    public  void _F_SET软键盘(MSG_ZHW msg){
    };

    public  void _F_CALL_仪表盘(MSG_ZHW msg){
    };

    public  void _F_CALL_原车蓝牙和USB(MSG_ZHW msg){
    };

    public  void _F_PAGE_CHANGE(String a,MSG_ZHW msg){
    };

    public  void _F_CALL_CDC(MSG_ZHW msg){
    };

    public  void _F_CALL_DVD(MSG_ZHW msg){
    };

    public  void _F_CALL_SD(MSG_ZHW msg){
    };

    public  void _F_CALL_USB(MSG_ZHW msg){
    };

    public  void _F_CALL_USB2(MSG_ZHW msg){
    };

    public  void _F_RE_SET_8202_POWER(MSG_ZHW msg){
    };

    public  void _F_CALL_图片(MSG_ZHW msg){
    };

    public  void _F_CALL_外部输入(MSG_ZHW msg){
    };

    public  void _F_CALL_导航(MSG_ZHW msg){
    };

    public  void _F_CALL_收音机(MSG_ZHW msg){
    	TO_SCRN(SCRN_收音机2);
    };

    public  void _F_CALL_蓝牙(MSG_ZHW msg){
    	TO_SCRN(SCRN_蓝牙);
    };

    public  void _F_CALL_蓝牙音乐(MSG_ZHW msg){
    };

    public  void _F_CALL_计算器(MSG_ZHW msg){
    };

    public  void _F_CALL_设置(MSG_ZHW msg){
    	TO_SCRN(SCRN_参数设置);
    };

    public  void _F_CALL_音乐(MSG_ZHW msg){
    };

    public  void _F_CALL_参数设置(MSG_ZHW msg){
    	TO_SCRN(SCRN_参数设置);
    };

    public  void _F_CALL_导航路径(MSG_ZHW msg){
    };

    public  void _F_方向盘设置(MSG_ZHW msg){
    	TO_SCRN(SCRN_方向盘设置);
    };

    public  void _F_显示设置(MSG_ZHW msg){
    };

    public  void _F_背景设置(MSG_ZHW msg){
    };

    public  void _F_车标设置(MSG_ZHW msg){
    };

    public  void _F_音频设置(MSG_ZHW msg){
    };

    public  void _F_NEXT_PAGE(MSG_ZHW msg){
    };

    public  void _F_REPOWER_ON(MSG_ZHW msg){
    };

    public  void _F_RUN_GPS(MSG_ZHW msg){
    };
    public void drawDynimic(Canvas c){
    	for(int i=0;i<iconNamesOrg.length;i++){
    		BASE_PNG_STRUCT pic=getBindScreen().findPng(iconNamesOrg[i]);
    		if(pic!=null){
    			pic.draw(c);
    		}
    	}
    	if(getActivePng()!=null){
    		// 绘制点下效果
    		getActivePng().drawActive(c);
    	}
    }
};
