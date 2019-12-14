
<style>
input[type=text], select {
  width: 400px;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100px;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

textarea{
    width: 80%;
    padding: 12px 20px;
    height: 200px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}
div {
  
  padding-top : 500px; 
  border-radius: 5px;
  padding: 20px;
}

.box {
    box-shadow:0 3px 6px rgba(0, 0, 0, 0.4);
    width :50%;
    padding-left : 100px;
}
</style>


    <div class="one">
        <div class="heading_bg">
            <h2>Add Product</h2>
        </div>
    </div>
<div class="one-half" style = "width: 25%; padding-top : 100px;">
        <img src="img/logo.png" style="width: 100%">
    </div>
<div class="one-half last" style="width:60%;box-shadow:0 3px 6px rgba(0, 0, 0, 0.4);">
  <form action="viewAddProduct" enctype="multipart/form-data" method="post">
        <strong><label for="name">Name</label></strong><br>
        <input type="text" id="name" name="name" placeholder="Name of product.."><br> 
        <strong><label for="category_id">Category ID</label></strong><br> 
        <input type="text" id="category_id" name="category_id" placeholder="Category id.."><br> 

        <strong><label for="price">Price</label></strong> <br> 
        <input type="text" id="price" name="price" placeholder="Price of product.."><br> 

        <strong><label for="warranty">Warranty</label></strong> <br> 
        <input type="text" id="price" name="warranty" placeholder="Warranty of product.."><br> 
        
        <strong><label for="Description">Description</label></strong><br> 
        <input type="text" id="Description" name="Description" placeholder="Description of product.."><br> 

        <strong><label for="DescriptionDetail">Description Detail</label></strong><br> 
        <textarea id="DescriptionDetail" name="DescriptionDetail">
        </textarea><br>
    
        <strong><label>Main Image </label></strong>
        <input type="file" onchange="preview_image(event)" name="img" id="img" value="" class="text requiredField"><br>

        <strong><label>Description Image </label></strong>
        <input type="file" onchange="preview_image(event)" name="image1" id="Myname1" value="" class="text requiredField">
        <input type="file" name="image2" id="Myname2" onchange="preview_image(event)" value="" class="text requiredField">
        <input type="file" name="image3" id="Myname3" onchange="preview_image(event)" value="" class="text requiredField">
        <input type="file" name="image4" id="Myname4" onchange="preview_image(event)" value="" class="text requiredField">
        <input type="file" name="image5" id="Myname5"onchange="preview_image(event)"  value="" class="text requiredField">
        
        
        <br><input type="submit" value="Submit">
    </form>
</div>

    
<div style="padding: 700px"></div>
