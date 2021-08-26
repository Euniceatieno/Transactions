package com.example.wallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class TransactionListAdapter(var transContent: List<Wallet>):RecyclerView.Adapter<TransactionsViewHolderr>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionsViewHolder {
        var itemView= LayoutInflater.from(parent.context).inflate(R.layout.transactionviewlist, parent,false)
        return TransactionsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TransactionsViewHolder, position: Int) {
        var currentTrans=transContent[position]
        holder.tvDes.text=currentTrans.description
        holder.tvRef.text=currentTrans.reference
        holder.tvAmount.text=currentTrans.amount.toString()
        holder.tvDate.text=currentTrans.date
        holder.tvCard.text=currentTrans.card

    }

    override fun getItemCount(): Int {
        return transContent.size
    }
}
class TransactionsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvDes=itemView.findViewById<TextView>(R.id.tvDes)
    var tvRef=itemView.findViewById<TextView>(R.id.tvRef)
    var tvAmount=itemView.findViewById<TextView>(R.id.tvAmount)
    var tvDate=itemView.findViewById<TextView>(R.id.tvDate)
    var tvCard=itemView.findViewById<TextView>(R.id.tvCard)


}