<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript" src="./web/index.js"></script>
    <link rel="stylesheet" href="./web/index.css"></head>
  <body>
        <h1><% out.println("Hello World");%></h1>
    <div class="container">
      <div class="btn-outer-container">
      <div class="btn-container">
        <button class="btn" id="btn-hello" data-popup="popup-thankyou">Approve</button>
        <button class="btn" id="btn-bye" data-popup="popup-comeback">Cancel</button>
      </div>
      </div>
    </div>

    <div class="popup" id="popup-comeback">Come back Soon!</div>
    <div class="popup" id="popup-thankyou">Thank you!</div>
  </body>
</html>
