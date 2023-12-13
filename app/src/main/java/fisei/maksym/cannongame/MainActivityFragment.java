package fisei.maksym.cannongame;


import android.media.AudioManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.maksym.cannongame.R;

public class MainActivityFragment extends Fragment {
    private CannonView cannonView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_activity, container, false);
        cannonView = (CannonView) view.findViewById(R.id.cannon_view);
        return view; // ¡Asegúrate de devolver la vista que has inflado!
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getActivity().setVolumeControlStream(AudioManager.STREAM_MUSIC);
    }

    @Override
    public void onPause() {
        super.onPause();
        cannonView.stopGame();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        cannonView.releaseResources();
    }
}
