<?php ?>
<div>
    <a href="/index.php" id="logo-image">
        <img src="/assets/images/gsi-logo-48x48.png" alt="logo">
    </a>
    <a href="/index.php" id="logo-text">        
        <img src="/assets/images/gsi-text-logo.png" alt="logo-text">
    </a>
    <a href="/index.php" id="logo-msg">        
        Green Ideas of Invention
    </a>
    <div>
        <a href="/index.php">donate</a>
        <ul>
            <?php if($selected_tab == 'HOME'){ ?>
            <li class="selected">
                <a href="/index.php">Home</a>
            </li>
            <?php } else {?>
            <li >
                <a href="/index.php">Home</a>
            </li>
             <?php } ?>
            
            
            <?php if($selected_tab == 'ABOUT'){ ?>
            <li class="selected">
                <a href="#">About</a>
            </li>
            <?php } else {?>
            <li >
                <a href="#">About</a>
            </li>
             <?php } ?>
            
            <?php if($selected_tab == 'PRODUCTS'){ ?>
            <li class="selected">
                <a href="/content/product/products.php">Products</a>
            </li>
            <?php } else {?>
            <li >
                <a href="/content/product/products.php">Products</a>
            </li>
             <?php } ?>
            
            <?php if($selected_tab == 'DEMO'){ ?>
            <li class="selected">
                <a href="/content/demo/demo-apps.php">Demo</a>
            </li>
            <?php } else {?>
            <li >
                <a href="/content/demo/demo-apps.php">Demo</a>
            </li>
             <?php } ?>
            
            <?php if($selected_tab == 'CONTACT'){ ?>
            <li class="selected">
                <a href="#">Contact</a>
            </li>
            <?php } else {?>
            <li >
                <a href="#">Contact</a>
            </li>
             <?php } ?>
            
            <?php if($selected_tab == 'BLOG'){ ?>
            <li class="selected">
                <a href="#">Blog</a>
            </li>
            <?php } else {?>
            <li >
                <a href="#">Blog</a>
            </li>
             <?php } ?>
            
        </ul>
    </div>
</div>