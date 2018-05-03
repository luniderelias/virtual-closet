package thinkapps.com.virtualcloset.View.Home;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.INotificationSideChannel;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.ArrayList;
import java.util.List;

import thinkapps.com.virtualcloset.Model.Piece;
import thinkapps.com.virtualcloset.R;

@EFragment(R.layout.fragment_available_pieces)
public class AvailablePiecesFragment extends Fragment {

    public ViewStub stubList;
    public ViewStub stubGrid;

    public ListView piecesListView;
    public GridView piecesGridView;

    @Click(R.id.gridOrListButton)
    public void clickButton(){
        switchView();
    }

    private PiecesListViewAdapter piecesListViewAdapter;
    private PiecesGridViewAdapter piecesGridViewAdapter;
    private List<Piece> pieces;

    private int currentViewMode = 0;
    static final int VIEW_MODE_LIST = 0;
    static final int VIEW_MODE_GRID = 1;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @AfterViews
    public void afterViews(){
        stubList = (ViewStub) getActivity()
                .findViewById(R.id.piecesStubList);
        stubGrid = (ViewStub) getActivity()
                .findViewById(R.id.piecesStubGrid);

        stubList.inflate();
        stubGrid.inflate();

        piecesListView = (ListView) getActivity()
                .findViewById(R.id.piecesListView);
        piecesGridView = (GridView) getActivity()
                .findViewById(R.id.piecesGridView);

        getPieces();

        SharedPreferences sharedPreferences =
                getActivity().getSharedPreferences("ViewMode", Context.MODE_PRIVATE);
        currentViewMode = sharedPreferences.getInt("currentViewMode", VIEW_MODE_LIST);

        switchView();
    }
    private void switchView() {
        if(currentViewMode == VIEW_MODE_LIST){
            stubList.setVisibility(View.VISIBLE);
            stubGrid.setVisibility(View.GONE);
        }else{
            stubList.setVisibility(View.GONE);
            stubGrid.setVisibility(View.VISIBLE);
        }
        setAdapters();
    }

    private void setAdapters(){
        if(currentViewMode == VIEW_MODE_LIST){
            piecesListViewAdapter = new PiecesListViewAdapter(
                    getActivity(),R.layout.pieces_list_view,pieces);
            piecesListView.setAdapter(piecesListViewAdapter);
        }else{
            piecesGridViewAdapter = new PiecesGridViewAdapter(
                    getActivity(),R.layout.pieces_grid_view,pieces);
            piecesGridView.setAdapter(piecesGridViewAdapter);
        }
    }

    private List<Piece> getPieces(){
        pieces = new ArrayList<>();
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));
        pieces.add(new Piece("Title","Description",R.drawable.camera));

        return pieces;
    }
}
