package adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.bengkuluexist.R;
import model_data.Item;

import java.util.ArrayList;


public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ListViewHolder> {
    private ArrayList<Item> listItem;

    public ItemAdapter(ArrayList<Item> list) {
        this.listItem = list;
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ItemAdapter.ListViewHolder holder, int position) {
        Item Item = listItem.get(position);
        Glide.with(holder.itemView.getContext())
                .load(Item.getPhoto())
                .apply(new RequestOptions().override(90, 90).placeholder(R.drawable.loading))
                .into(holder.foto);
        holder.nama.setText(Item.getNama());
        holder.kategori.setText(Item.getKategori());
        holder.keterangan.setText(Item.getKeterangan());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listItem.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView foto;
        TextView nama, kategori, keterangan;
        ListViewHolder(View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.foto_item);
            nama = itemView.findViewById(R.id.nama_item);
            kategori = itemView.findViewById(R.id.kat_item);
            keterangan = itemView.findViewById(R.id.ket_item);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Item data);
    }
}
