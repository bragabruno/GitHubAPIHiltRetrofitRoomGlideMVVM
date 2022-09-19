package com.example.githubapihiltretrofitroomglidemvvm.network

data class RecyclerList(val items: List<RecyclerData>)
data class RecyclerData(val name: String?, val description: String?, val owner: Owner?)
data class Owner(val avatar_url: String?)
