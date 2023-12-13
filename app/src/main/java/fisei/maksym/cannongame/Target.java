package fisei.maksym.cannongame;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.maksym.cannongame.R;

public class Target extends GameElement {
    private int hitReward;

    public Target(CannonView view, int color, int hitReward, int x, int y, int width, int length, float velocityY) {
        super(view, color, CannonView.TARGET_SOUND_ID, x, y, width, length, velocityY);
        this.hitReward = hitReward;
    }

    public int getHitReward() {
        return hitReward;
    }

    public static class login extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_logininicio);
        }
    }
}
