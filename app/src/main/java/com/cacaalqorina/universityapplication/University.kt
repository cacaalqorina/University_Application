package com.cacaalqorina.universityapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class University(
    var name: String = "",
    var accreditation: String = "",
    var address: String = "",
    var standingYear: Int = 0,
    var synopsis: String = "",
    var cover: Int = 0,
): Parcelable
