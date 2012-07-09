<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Multi-page template</title>
    <link rel="stylesheet" href="css/jquery-mobile.css"/>
    <link rel="stylesheet" href="css/mobiscroll-2.0rc2.full.min.css"/>
    <link rel="stylesheet" href="css/main.css"/>

</head>


<body>

<!-- Start of first page: #one -->
<div data-role="page" id="one" data-theme="b">

    <div data-role="header">
        <h1>Home</h1>
    </div>
    <!-- /header -->

    <div data-role="content">

        <div class="center">
            <img src="/css/images/cookStVillageLogo.png">
        </div>
    </div>
    <!-- /content -->

    <div class="footer"></div>
</div>
<!-- /page one -->


<!-- Start of second page: #two -->
<div data-role="page" id="two" data-theme="b">

    <div data-role="header">
        <h1>Add Patient</h1>
    </div>
    <!-- /header -->

    <div data-role="content">
        <form action="/addPatient" id='add-patient-form' method="post">
            <fieldset>
                <div data-role="name">
                    <!--Personal information -->
                    <label for="name">Name:</label>
                    <input type="text" name="name" id="name" value=""/>
                    <label for="date-of-birth">Date of Birth:</label>
                    <input type="text" name="date-of-birth" id="date-of-birth" value=""/>
                    <label for="address">Address:</label>
                    <textarea name="address" id="address" value=""></textarea>
                    <label for="phone-number">Phone Number:</label>
                    <input type="text" name="phone-number" id="phone-number" value=""/>
                    <label for="referred">Who referred you to our clinic:</label>
                    <input type="text" name="referred" id="referred" value=""/>
                    <label for="physician-name">Physician's name:</label>
                    <input type="text" name="physician-name" id="physician-name" value=""/>

                    <div data-role="fieldcontain">
                        <label for="discuss-with-physician">Can we discuss your case information with your
                            physician?</label>
                        <select name="discuss-with-physician" id="discuss-with-physician" data-role="slider">
                            <option value="yes">Yes</option>
                            <option value="no">No</option>
                        </select>
                    </div>

                    <label for="personal-health-number">Personal Health Number (PHN):</label>
                    <input type="text" name="personal-health-number" id="personal-health-number" value=""/>
                    <label for="icbc-number">WCB or ICBC Claim Number:</label>
                    <input type="text" name="icbc-number" id="icbc-number" value=""/>

                    <!-- injury info -->
                    <label for="primary-complaint">Primary complaint:</label>
                    <textarea name="primary-complaint" id="primary-complaint" value=""></textarea>
                    <label for="area-of-injury">Area of injury:</label>
                    <input type="text" name="area-of-injury" id="area-of-injury" value=""/>
                    <label for="date-of-injury">Date of injury:</label>
                    <input type="text" name="date-of-injury" id="date-of-injury" value=""/>
                    <label for="mechanism-of-injury">Mechanism of injury:</label>
                    <input type="text" name="mechanism-of-injury" id="mechanism-of-injury" value=""/>

                    <div data-role="fieldcontain">
                        <label for="have-had-injury-before">Have you had this injury in the past?</label>
                        <select name="have-had-injury-before" id="have-had-injury-before" data-role="slider">
                            <option value="yes">Yes</option>
                            <option value="no">No</option>
                        </select>
                    </div>
                    <label for="history-of-illness">History of previous injury or illness:</label>
                    <textarea name="history-of-illness" id="history-of-illness" value=""></textarea>
                    <label for="current-medications">Current medications:</label>
                    <textarea name="current-medications" id="current-medications" value=""></textarea>

                    <!--Basic health information-->
                    <h2>Have you experienced/suffered from the following:</h2>

                    <div class="ui-grid-c basic-health-information">

                        <div class="ui-block-a">
                            <div data-role="fieldcontain">
                                <label for="dizziness">Dizziness</label>
                                <select name="dizziness" id="dizziness" data-role="slider">
                                    <option value="yes">Yes</option>
                                    <option value="no">No</option>
                                </select>
                            </div>
                            <div data-role="fieldcontain">
                                <label for="arthritis">Arthritis</label>
                                <select name="arthritis" id="arthritis" data-role="slider">
                                    <option value="yes">Yes</option>
                                    <option value="no">No</option>
                                </select>
                            </div>
                            <div data-role="fieldcontain">
                                <label for="diabetes">Diabetes</label>
                                <select name="diabetes" id="diabetes" data-role="slider">
                                    <option value="yes">Yes</option>
                                    <option value="no">No</option>
                                </select>
                            </div>
                        </div>

                        <div class="ui-block-b">
                            <div data-role="fieldcontain">
                                <label for="heart-trouble">Heart trouble</label>
                                <select name="heart-trouble" id="heart-trouble" data-role="slider">
                                    <option value="yes">Yes</option>
                                    <option value="no">No</option>
                                </select>
                            </div>
                            <div data-role="fieldcontain">
                                <label for="asthma">Asthma</label>
                                <select name="asthma" id="asthma" data-role="slider">
                                    <option value="yes">Yes</option>
                                    <option value="no">No</option>
                                </select>
                            </div>
                            <div data-role="fieldcontain">
                                <label for="numbness-or-tingling">Numbness and/or tingling</label>
                                <select name="numbness-or-tingling" id="numbness-or-tingling" data-role="slider">
                                    <option value="yes">Yes</option>
                                    <option value="no">No</option>
                                </select>
                            </div>
                        </div>
                        <div class="ui-block-c">
                            <div data-role="fieldcontain">
                                <label for="chest-pain">Chest pain brought on by activity</label>
                                <select name="chest-pain" id="chest-pain" data-role="slider">
                                    <option value="yes">Yes</option>
                                    <option value="no">No</option>
                                </select>
                            </div>
                            <div data-role="fieldcontain">
                                <label for="cancer">Cancer</label>
                                <select name="cancer" id="cancer" data-role="slider">
                                    <option value="yes">Yes</option>
                                    <option value="no">No</option>
                                </select>
                            </div>
                            <div data-role="fieldcontain">
                                <label for="high-blood-pressure">High blood pressure</label>
                                <select name="high-blood-pressure" id="high-blood-pressure" data-role="slider">
                                    <option value="yes">Yes</option>
                                    <option value="no">No</option>
                                </select>
                            </div>
                        </div>
                    </div>
                </div>
                <label for="past-surgeries">Have you had any past surgeries? If so please provide date and
                    description:</label>
                <textarea name="past-surgeries" id="past-surgeries" value=""></textarea>
                <label for="not-perform-exercise">Any know reasons why you should <strong>NOT</strong> perform exercise:</label>
                <textarea name="not-perform-exercise" id="not-perform-exercise" value=""></textarea>

            </fieldset>
            <div data-role="controlgroup" data-type="horizontal">
                <button type="submit" data-theme="b" class="submit" name="submit" value="submit-value">Submit</button>
                <button type="reset" data-theme="e" name="reset" class="reset">Reset</button>
            </div>
        </form>
    </div>
    <!-- /content -->

    <div class="footer"></div>

</div>
<!-- /page two -->

<!-- Start of third page: #settings -->
<div data-role="page" id="settings" data-theme="b">

    <div data-role="header">
        <h1>Settings</h1>
    </div>
    <!-- /header -->

    <div data-role="content">
        <h2>Settings</h2>

        <form action="#popup" method="get" class="settings">
            <fieldset>
                <div data-role="fieldcontain">
                    <label for="physio-office">Name of company:</label>
                    <input type="text" name="physio-office" id="physio-office" value=""/>
                    <label for="email-of-office">Office email:</label>
                    <input type="email" name="email-of-office" id="email-of-office" value=""/>
                </div>
            </fieldset>
            <button class="settings-button" type="submit" data-theme="b" name="submit" value="submit-value">Save
            </button>
        </form>


    </div>
    <!-- /content -->

    <div class="footer"></div>
    <a href="update" data-rel="dialog" data-transition="pop" id="dialog">Open dialog</a>
</div>
<!-- /page two -->

<!-- Start of third page: #popup -->
<div data-role="page" id="popup">

    <div data-role="header" data-theme="e">
        <h1>Dialog</h1>
    </div>
    <!-- /header -->

    <div data-role="content" data-theme="d">
        <h2>Popup</h2>

        <p>I have an id of "popup" on my page container and only look like a dialog because the link to me had a <code>data-rel="dialog"</code>
            attribute which gives me this inset look and a <code>data-transition="pop"</code> attribute to change the
            transition to pop. Without this, I'd be styled as a normal page.</p>

        <p><a href="#one" data-rel="back" data-role="button" data-inline="true" data-icon="back">Back to page "one"</a>
        </p>
    </div>
    <!-- /content -->

    <div class="footer"></div>
</div>
<!-- /page popup -->
<script src="/js/jquery-1.7.2.min.js"></script>
<script src="/js/jquery-mobile-1.1.0.js"></script>
<script src="/js/handlbars-1-beta6.js"></script>
<script src="/js/mobiscroll-2.0rc2.full.min.js"></script>
<script src="/js/templates.js"></script>
<script src="/js/main.js"></script>
</body>
</html>