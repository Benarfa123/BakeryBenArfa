package io.eskills.benarfaboulangerie.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import io.eskills.benarfaboulangerie.R
import io.eskills.benarfaboulangerie.controller.ProductAdapter
import io.eskills.benarfaboulangerie.models.Product

class SugarFragment : Fragment() {
    private var recyclerView: RecyclerView? = null
    private var gridLayoutManager: StaggeredGridLayoutManager? = null
    private var productAdapter: ProductAdapter? = null
    private var arrayList: ArrayList<Product>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_sugar, container, false)
        recyclerView = view.findViewById(R.id.list_sugar)
        gridLayoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        gridLayoutManager?.gapStrategy =
            StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS
        recyclerView?.layoutManager = gridLayoutManager
        arrayList = ArrayList()
        arrayList!!.add(Product(R.drawable.baklawetlobnan, "Baklawat Lobnan","40 Dt"))
        arrayList!!.add(Product(R.drawable.crapechocolat, "Crepe Chocolat","5 Dt"))
        arrayList!!.add(Product(R.drawable.croissant, "Croissant","1 Dt"))
        arrayList!!.add(Product(R.drawable.donuts, "Donuts","4 Dt"))
        arrayList!!.add(Product(R.drawable.gauffre, "Gauffres","7 Dt"))
        arrayList!!.add(Product(R.drawable.kounefa, "Kounefa","35 Dt"))
        arrayList!!.add(Product(R.drawable.samsa, "Samsa","20 Dt"))
        arrayList!!.add(Product(R.drawable.zouza, "Zouza","20 Dt"))
        productAdapter = ProductAdapter(context!!, arrayList!!)
        recyclerView?.adapter = productAdapter
        return view
    }

}