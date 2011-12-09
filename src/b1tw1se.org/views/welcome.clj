(ns b1tw1se.org.views.welcome
  (:require [b1tw1se.org.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/welcome" []
         (common/layout
           [:p "Welcome to b1tw1se.org"]))
