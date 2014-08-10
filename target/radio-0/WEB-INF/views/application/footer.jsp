<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<div class="container">
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default _1">
                <div class="row">
                    <div class="col-lg-4 text-center">
                        <h4><spring:message code="text7"/> </h4>
                        <hr>
                        <div id="stationsByClick">
                        </div>                    
                    </div>
                    <div class="col-lg-4 text-center">
                        <h4><spring:message code="text8"/></h4>
                        <hr>
                        <div id="stationsByOrder">
                        </div>                    
                    </div>
                    <div class="col-lg-4 text-center">
                        <h4><spring:message code="text9"/></h4>
                        <hr>
                        <a href="https://twitter.com/hoy_radio" class="twitter-follow-button" data-show-count="false" data-lang="es">Seguir a @hoy_radio</a>
                        <script>!function(d, s, id) {
                                var js, fjs = d.getElementsByTagName(s)[0], p = /^http:/.test(d.location) ? 'http' : 'https';
                                if (!d.getElementById(id)) {
                                    js = d.createElement(s);
                                    js.id = id;
                                    js.src = p + '://platform.twitter.com/widgets.js';
                                    fjs.parentNode.insertBefore(js, fjs);
                                }
                            }(document, 'script', 'twitter-wjs');
                        </script>
                        <br/>
                        <br/>
                        <div id="fb-root"></div>
                        <script>(function(d, s, id) {
                                var js, fjs = d.getElementsByTagName(s)[0];
                                if (d.getElementById(id))
                                    return;
                                js = d.createElement(s);
                                js.id = id;
                                js.src = "//connect.facebook.net/es_LA/all.js#xfbml=1";
                                fjs.parentNode.insertBefore(js, fjs);
                            }(document, 'script', 'facebook-jssdk'));
                        </script>
                        <div class="fb-like-box" data-href="http://www.facebook.com/hoyradio" data-colorscheme="light" data-show-faces="true" data-header="true" data-stream="false" data-show-border="true"></div>
                        <br/>
                        <br/>
                        <a class="twitter-timeline" href="https://twitter.com/hoy_radio" data-widget-id="414839500141916161">Tweets por @hoy_radio</a>
                        <script>!function(d, s, id) {
                                var js, fjs = d.getElementsByTagName(s)[0], p = /^http:/.test(d.location) ? 'http' : 'https';
                                if (!d.getElementById(id)) {
                                    js = d.createElement(s);
                                    js.id = id;
                                    js.src = p + "://platform.twitter.com/widgets.js";
                                    fjs.parentNode.insertBefore(js, fjs);
                                }
                            }(document, "script", "twitter-wjs");
                        </script>
                    </div>
                </div>
            </div>
        </div>    
    </div>
</div>

<script>
    (function(i, s, o, g, r, a, m) {
        i['GoogleAnalyticsObject'] = r;
        i[r] = i[r] || function() {
            (i[r].q = i[r].q || []).push(arguments)
        }, i[r].l = 1 * new Date();
        a = s.createElement(o),
                m = s.getElementsByTagName(o)[0];
        a.async = 1;
        a.src = g;
        m.parentNode.insertBefore(a, m)
    })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');

    ga('create', 'UA-45347943-1', 'auto');
    ga('send', 'pageview');

</script>
