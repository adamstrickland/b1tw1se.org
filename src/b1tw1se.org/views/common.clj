(ns b1tw1se.org.views.common
  (:use [noir.core :only [defpartial]]
        [hiccup.page-helpers :only [include-css html5]]))

(defpartial layout [& content]
            (html5
              [:head
               [:title "b1tw1se.org"]
               (include-css "/css/reset.css")]
              [:body
               [:div#wrapper
                content]]))
