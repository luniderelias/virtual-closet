package thinkapps.com.virtualcloset.View.Home;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.List;

import thinkapps.com.virtualcloset.Model.Piece;
import thinkapps.com.virtualcloset.R;

/**
 * Created by lunid on 11/02/2018.
 */

public class PiecesListViewAdapter extends ArrayAdapter<Piece> {
    public PiecesListViewAdapter(Context context, int resource, List<Piece> pieces) {
        super(context, resource, pieces);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        super.getView(position, convertView, parent);
        View v = convertView;
        if (v == null) {
            LayoutInflater inflater = (LayoutInflater)
                    getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.pieces_list_item,null);
        }
        Piece piece = getItem(position);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        imageView.setImageResource(piece.getImageId());
        return v;
    }
}
