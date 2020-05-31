package prateek.gds.recyclergridexample;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdepter extends RecyclerView.Adapter<RecyclerAdepter.MyHolder> {

    private int[] images;
    private Context context;

    public RecyclerAdepter(int[] images, Context context) {
        this.images = images;
        this.context = context;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.album_layout, parent, false);
        MyHolder holder = new MyHolder(view, context, images);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        int imageId = images[position];
        holder.album.setImageResource(imageId);
        holder.album_title.setText("image"+(position+1));
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    static class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView album_title;
        ImageView album;
        Context context;
        int[] images;

        MyHolder(@NonNull View itemView, Context context, int[] images) {
            super(itemView);
            this.album = itemView.findViewById(R.id.album);
            this.album_title = itemView.findViewById(R.id.album_title);
            this.context = context;
            this.images = images;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, DisplayActivity.class);
            intent.putExtra("Image_id", images[getAdapterPosition()]);

            context.startActivity(intent);
        }
    }
}
