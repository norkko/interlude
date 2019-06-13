package net.interlude.item.domain

import lombok.Data

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


@Entity
class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    internal var id: Int = 0
    internal var name: String? = null
    internal var description: String? = null

    constructor(id: Int, name: String?, description: String?) {
        this.id = id
        this.name = name
        this.description = description
    }


}
