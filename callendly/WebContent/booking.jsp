<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Java Date Picker</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
            $(function () {
                $("#datepicker").datepicker();
            });
        </script>
    </head>
    <body>
        <Pre>
        <form action="DatePicker.jsp">
        <table style ="width: 50%">
        <td> Enter your name:</td>
<td><input type="text" name="user_name"/></td>
</tr>
<tr>
<td> Enter your email</td>
<td><input type="text" name="email"/></td>
</tr>
<td> Enter your slot timmings </td>
<td> <input type="text" name="time"> </td>
</table>

   <label for="datepicker">Choose your appointment date:</label>
       <input type="text" name="dob" id="datepicker">
            
            <input type="submit" value="Submit">
        </form>
        </pre>    
    </body>
</html>