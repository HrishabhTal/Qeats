

package com.crio.qeats.exchanges;

import com.crio.qeats.dto.Restaurant;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetRestaurantsResponse {
    List<Restaurant> restaurants;
  
}


