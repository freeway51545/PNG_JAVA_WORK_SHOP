package zhw.screen.action.user.actions;
import zhw.png.BASE_PNG_STRUCT;
import zhw.screen.action.MSG_ZHW;
import zhw.screen.action.user.MAIN1_Event;
import android.graphics.Canvas;
public class MAIN1_Event_funcs extends MAIN1_Event {
	String iconNamesOrg[]={
			"����","������","����","DVD",
			"SD��","USB","����","��������",
			"GPS�ź�","�ⲿ����","IPOD","����",
			"��Ϸ","¼��","ͼƬ","ԭ������USB","������","�Ǳ���","����","������"
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

    public  void _F_����(MSG_ZHW msg){
    };

    public  void _F_����(MSG_ZHW msg){
    };

    public  void _F_��������(MSG_ZHW msg){
    };

    public  void _F_CALL_IPOD(MSG_ZHW msg){
    };

    public  void _F_CALL_����(MSG_ZHW msg){
    };

    public  void _F_CALL_GPS�ź�(MSG_ZHW msg){
    };

    public  void _F_CALL_������(MSG_ZHW msg){
    };

    public  void _F_SET�����(MSG_ZHW msg){
    };

    public  void _F_CALL_�Ǳ���(MSG_ZHW msg){
    };

    public  void _F_CALL_ԭ��������USB(MSG_ZHW msg){
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

    public  void _F_CALL_ͼƬ(MSG_ZHW msg){
    };

    public  void _F_CALL_�ⲿ����(MSG_ZHW msg){
    };

    public  void _F_CALL_����(MSG_ZHW msg){
    };

    public  void _F_CALL_������(MSG_ZHW msg){
    	TO_SCRN(SCRN_������2);
    };

    public  void _F_CALL_����(MSG_ZHW msg){
    	TO_SCRN(SCRN_����);
    };

    public  void _F_CALL_��������(MSG_ZHW msg){
    };

    public  void _F_CALL_������(MSG_ZHW msg){
    };

    public  void _F_CALL_����(MSG_ZHW msg){
    	TO_SCRN(SCRN_��������);
    };

    public  void _F_CALL_����(MSG_ZHW msg){
    };

    public  void _F_CALL_��������(MSG_ZHW msg){
    	TO_SCRN(SCRN_��������);
    };

    public  void _F_CALL_����·��(MSG_ZHW msg){
    };

    public  void _F_����������(MSG_ZHW msg){
    	TO_SCRN(SCRN_����������);
    };

    public  void _F_��ʾ����(MSG_ZHW msg){
    };

    public  void _F_��������(MSG_ZHW msg){
    };

    public  void _F_��������(MSG_ZHW msg){
    };

    public  void _F_��Ƶ����(MSG_ZHW msg){
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
    		// ���Ƶ���Ч��
    		getActivePng().drawActive(c);
    	}
    }
};
