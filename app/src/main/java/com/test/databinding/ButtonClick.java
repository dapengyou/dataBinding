package com.test.databinding;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * 也可以放在Activity中
 * Created by lady_zhou on 2018/1/24.
 */

public class ButtonClick {
    public void onClickBtOne(View mView) {
        Toast.makeText(mView.getContext(), "点击了按钮1", Toast.LENGTH_SHORT).show();
        Log.d("123", "点击了按钮1");
    }

    public void onClickBtTwo(View mView) {
        Toast.makeText(mView.getContext(), "点击了按钮2", Toast.LENGTH_SHORT).show();
        Log.d("123", "点击了按钮2");
    }

    public void onClickBtThree(View mView) {
    }

    public void onClickBtFour(View mView) {

    }

    public String getBtTwoText() {
        return "在代码中设置文字";
    }

}
