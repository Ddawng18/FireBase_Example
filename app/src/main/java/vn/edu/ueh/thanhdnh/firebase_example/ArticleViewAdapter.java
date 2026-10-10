package vn.edu.ueh.thanhdnh.firebase_example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ArticleViewAdapter extends RecyclerView.Adapter<ArticleViewHolder> {
  private LayoutInflater mInflater;
  private List<Article> articlelist;

  public ArticleViewAdapter(Context context, List<Article> articlelist) {
    this.mInflater = LayoutInflater.from(context);
    this.articlelist = articlelist;
  }

  public void update(List<Article> articlelist){
    this.articlelist = articlelist;
  }

  @NonNull
  @Override
  public ArticleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View customView = mInflater.inflate(R.layout.contact_list, parent, false);
    return new ArticleViewHolder(customView, this);
  }

  @Override
  public void onBindViewHolder(@NonNull ArticleViewHolder holder, int position) {
    Article currentarticle = articlelist.get(position);
    holder.getTxtTitle().setText(currentarticle.getTitle());
    holder.getTxtContent().setText(currentarticle.getContent());
    holder.getTxtImageUrl().setText(currentarticle.getImageUrl());
  }

  @Override
  public int getItemCount() {
    return articlelist.size();
  }
}
