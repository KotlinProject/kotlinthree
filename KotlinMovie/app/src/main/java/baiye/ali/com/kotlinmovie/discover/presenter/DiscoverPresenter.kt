package baiye.ali.com.kotlinmovie.discover.presenter

import baiye.ali.com.kotlinmovie.discover.model.DiscoverModel
import baiye.ali.com.kotlinmovie.discover.view.DiscoverView

/**
 * Created by 31962 on 2017/12/27.
 */
class DiscoverPresenter(discoverView : DiscoverView) : DiscoverPresenterInt{
    var discoverView: DiscoverView? = discoverView
    var discoverModel : DiscoverModel? = DiscoverModel()
    override fun DiscoverP() {

    }

}