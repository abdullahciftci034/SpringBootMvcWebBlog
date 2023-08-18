<%@ page language="java" contentType="text/html" %>
<link rel="stylesheet" href="${initParam.webname}/static/public/css/search.css">
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<form action="#" method="post" class="search" >
    <fieldset>
    <legend>Search</legend>
    <div > 
        <span>
            <label for="txtsearch"> <img src=""/>Search</label>
        </span>
            <span class="search_span">
              <div>
                <input id="search" name="search" class="search" type="search"  title="search" placeholder="search" class="form-control" >	       
              </div> 
            </span> 
     </div>
    </fieldset>
    <div class="ekle" >
        <ul class="ekle">
        </ul>
    </div>
    
  </form>
<script>
$(document).ready(function() {
	var newsById="${initParam.newsById}";
    // Add event listener to the input element
    $('input.search').on('keyup', function() {
        var searchTerm = $(this).val(); // Get the input value
        
        // Fetch data from the server using AJAX
        $.ajax({
            url: "${initParam.search}/", // Replace with the actual URL to fetch data
            method: 'POST',
            data: { search:searchTerm },
            success: function(response) {
            	
                 var listItems = '';
                 // Loop through the items and generate list items
                 for (var i = 0; i < response.length; i++) {
                     if (response[i].hasOwnProperty('age')) {
                         listItems += '<li> ' + response[i].name + ' | ' + response[i].email +' </li>';
                     }else{
                    	 listItems += '<li> <a href="'+newsById+'/'+response[i].id+'">' + response[i].title + ' | 	' + response[i].content + '</a></li>';
                     }
                 
                 }	
                
                $('ul.ekle').html(listItems);
            },
            error: function() {
                $('ul.ekle').html('Error fetching data');
            }
        });
    });
});
</script>



  





