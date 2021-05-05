package io.eskills.benarfaboulangerie.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import io.eskills.benarfaboulangerie.R
import io.eskills.benarfaboulangerie.controller.ProductAdapter
import io.eskills.benarfaboulangerie.models.Product


class SaltyFragment : Fragment() {
    private var recyclerView: RecyclerView? = null
    private var gridLayoutManager: StaggeredGridLayoutManager? = null
    private var productAdapter: ProductAdapter? = null
    private var arrayList: ArrayList<Product>? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_salty, container, false)
        recyclerView = view.findViewById(R.id.list_salt)
        gridLayoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        gridLayoutManager?.gapStrategy =
            StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS
        recyclerView?.layoutManager = gridLayoutManager
        arrayList = ArrayList()
        arrayList!!.add(Product(R.drawable.batbout, "Batbout","2 Dt"))
        arrayList!!.add(Product(R.drawable.fricasse, "Fricasse","1 Dt"))
        arrayList!!.add(Product(R.drawable.gauffresale, "Gauffre Sale","9 Dt"))
        arrayList!!.add(Product(R.drawable.miniburger, "Mini Burger","40 Dt"))
        arrayList!!.add(Product(R.drawable.minipizza, "Mini Pizza","35 Dt"))
        arrayList!!.add(Product(R.drawable.pate, "Pate","2 Dt"))
        arrayList!!.add(Product(R.drawable.sainthonote, "Saint Honote","6 Dt"))
        arrayList!!.add(Product(R.drawable.tartesale, "Tarte Sale","9 Dt"))
        productAdapter = ProductAdapter(context!!, arrayList!!)
        recyclerView?.adapter = productAdapter
        return view
    }

}