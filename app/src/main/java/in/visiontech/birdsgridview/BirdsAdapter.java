package in.visiontech.birdsgridview;

import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;


public class BirdsAdapter extends BaseAdapter {
    Context context;
    ImageView imageview;
    Integer[] BirdsImages={R.drawable.img1,R.drawable.img2,R.drawable.img3,
            R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img1,R.drawable.img2,R.drawable.img3,
            R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img1,R.drawable.img2,R.drawable.img3,
            R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8};
     public BirdsAdapter(Context context){this.context=context;}
    @Override
    public int getCount() {
        return BirdsImages.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            imageview=new ImageView(context);
            imageview.setLayoutParams(new ViewGroup.LayoutParams(150,150));
        }
        else{
            imageview=(ImageView) view;
        }
        imageview.setImageResource(BirdsImages[i]);
        return imageview;
    }
}
