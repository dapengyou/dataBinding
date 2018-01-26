package com.test.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.test.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private User user;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("lady", "zhou");
        binding.setUser(user);
//        binding.setVariable(BR.user, user);//与上行效果相同
        binding.setButtonClick(new ButtonClick());//setButtonClick是自动生成的
    }

    public class ButtonClick {
        public String getBtTwoText() {
            return "在代码中设置文字";
        }

        public void onClickBtOne(View mView) {
            Toast.makeText(mView.getContext(), "点击了按钮1", Toast.LENGTH_SHORT).show();
            Log.d("123", "点击了按钮1");
        }

        public void onClickBtTwo(View mView) {
            Toast.makeText(mView.getContext(), "点击了按钮2", Toast.LENGTH_SHORT).show();
            Log.d("123", "点击了按钮2");
        }

        /**
         * 接收 user 点击后改变textView 的文字
         *
         * @param mUser
         */
        public void onClickBtThree(User mUser) {
            binding.tvChange.setText(mUser.getFirstName());
        }

        public void onTextChanged(CharSequence charSequence, int start, int end, int count) {
            user.setFirstName(charSequence.toString());
            //刷新user
            binding.setUser(user);
        }
    }

}
