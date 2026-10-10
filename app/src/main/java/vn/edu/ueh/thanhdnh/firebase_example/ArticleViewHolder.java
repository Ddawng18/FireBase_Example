package vn.edu.ueh.thanhdnh.firebase_example;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticleViewHolder extends RecyclerView.ViewHolder {
  private TextView txtTitle, txtContent, txtImageUrl;
  private ArticleViewAdapter adapter;

  public ArticleViewHolder(@NonNull View itemView, ArticleViewAdapter adapter) {
    super(itemView);
    txtTitle = itemView.findViewById(R.id.txt_title);
    txtContent = itemView.findViewById(R.id.txt_content);
    txtImageUrl = itemView.findViewById(R.id.txt_image_url);
    this.adapter = adapter;
  }

  public TextView getTxtTitle() {
    return txtTitle;
  }

  public void setTxtTitle(TextView txtTitle) {
    this.txtTitle = txtTitle;
  }

  public TextView getTxtContent() {
    return txtContent;
  }

  public void setTxtContent(TextView txtContent) {
    this.txtContent = txtContent;
  }

  public TextView getTxtImageUrl() {
    return txtImageUrl;
  }

  public void setTxtImageUrl(TextView txtImageUrl) {
    this.txtImageUrl = txtImageUrl;
  }
}
