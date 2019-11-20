package prototypeprogmob.com.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import prototypeprogmob.com.Model.DSN;
import prototypeprogmob.com.R;

public class DosenAdapter extends RecyclerView.Adapter<DosenAdapter.ViewHolder>{

    ArrayList<DSN> dsnArrayList;

    public DosenAdapter(ArrayList<DSN> dsnArrayList) {
        this.dsnArrayList = dsnArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_dosen,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtNidn.setText(dsnArrayList.get(position).getNidn());
        holder.txtNama.setText(dsnArrayList.get(position).getNama());
        holder.txtEmail.setText(dsnArrayList.get(position).getEmail());
        holder.txtAlamat.setText(dsnArrayList.get(position).getAlamat());
//        holder.ImgDsn.setImageResource(dsnArrayList.get(position).getImgDsn());
    }

    @Override
    public int getItemCount() { //untuk menghitung jumlah data yang ada//
        return (dsnArrayList != null) ?dsnArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNidn, txtNama, txtEmail, txtAlamat;
//        ImageView ImgDsn;

        public ViewHolder(View view){
            super(view);

            txtNidn = view.findViewById(R.id.txtNidn);
            txtNama = view.findViewById(R.id.txtNama);
            txtEmail = view.findViewById(R.id.txtEmail);
            txtAlamat = view.findViewById(R.id.txtAlamat);
//            ImgDsn = view.findViewById(R.id.ImgDsn);
        }
    }
}
