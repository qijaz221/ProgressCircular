package qijaz221.android.progresscircular

import android.content.res.Resources


fun dpToPx(dp: Int) = (dp * Resources.getSystem().displayMetrics.density).toInt()