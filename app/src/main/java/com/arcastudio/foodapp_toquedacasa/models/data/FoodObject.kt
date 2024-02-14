package com.arcastudio.foodapp_toquedacasa.models.data

import com.arcastudio.foodapp_toquedacasa.R

object FoodObject {
    val starterFoodList = listOf(
        FoodData(
            R.drawable.food_starter_french_fries,
            "Batata Frita",
            "Batatas cortadas em palitos e fritas.",
            20,
            10.99
        ),
        FoodData(
            R.drawable.food_starter_bruschetta,
            "Bruschetta de Tomate e Manjericão",
            "Fatias de pão italiano grelhado cobertas com tomates frescos, manjericão, alho e azeite de oliva.",
            10,
            12.50
        ),
        FoodData(
            R.drawable.food_starter_onion_soup,
            "Sopa de Cebola Gratinada",
            "Uma sopa de cebola caramelizada coberta com queijo Gruyère derretido e croutons crocantes.",
            30,
            18.75
        ),
        FoodData(
            R.drawable.food_starter_shrimp,
            "Camarão à Provençal",
            "Camarões suculentos salteados em alho, tomate, vinho branco e ervas provençais.",
            20,
            24.99
        )
    )

    val lunchFoodList = listOf(
        FoodData(
            R.drawable.food_lunch_chicken_strogonoff,
            "Strogonoff de Frango",
            "Frango desfiado cozido em um molho cremoso de creme de leite e tomate, geralmente servido com arroz branco e batata palha.",
            40,
            18.99
        ),
        FoodData(
            R.drawable.food_lunch_carbonara,
            "Espaguete à Carbonara",
            "Espaguete cozido al dente, misturado com bacon crocante, queijo parmesão, ovos e pimenta preta moída.",
            25,
            22.50
        ),
        FoodData(
            R.drawable.food_lunch_feijoada,
            "Feijoada",
            "Prato típico brasileiro, feito com feijão preto cozido com carne de porco, linguiça, bacon e outras carnes, geralmente servido com arroz branco, couve refogada, laranja e farofa.",
            180,
            29.99
        ),
        FoodData(
            R.drawable.food_lunch_caesar_salad,
            "Salada Caesar com Frango Grelhado",
            "Salada de alface romana, croutons, queijo parmesão ralado e peito de frango grelhado, servida com molho Caesar.",
            20,
            15.99
        )
    )
}