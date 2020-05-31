package prateek.gds.mvvm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdepter extends RecyclerView.Adapter<RecyclerAdepter.ViewHolder> {

    private List<BusModel> buses;

    public RecyclerAdepter(List<BusModel> buses) {
        this.buses = buses;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BusModel bus = buses.get(position);
        holder.operator.setText(bus.getOperator());
        holder.fare.setText(bus.getFare()+"");
    }

    @Override
    public int getItemCount() {
        return buses.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView operator, fare;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            operator = itemView.findViewById(R.id.operator);
            fare = itemView.findViewById(R.id.fare);
        }
    }
}
